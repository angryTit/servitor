package ru.angrytit.servitor.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zeroturnaround.exec.ProcessResult;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Util class to start/stop/restart processes
 * <p/>
 * Created by Mikhail Tyamin
 */
@Component
public class ProcessUtils {
    private static final Logger log = LoggerFactory.getLogger(ProcessUtils.class);

    private static final char SEPARATOR = ' ';
    private static final String LOG_SEPARATOR = " | ";

    private final ProcessExecutorWrapper executorProxy;

    @Autowired
    public ProcessUtils(ProcessExecutorWrapper executorProxy) {
        this.executorProxy = executorProxy;
    }

    private Optional<Integer> getPidOfProcessByPort(final int port) {
        log.info("port : [{}]", port);
        try {
            ProcessResult processResult = executorProxy.execute("netstat", "-apn");
            String output = processResult.outputUTF8();

            Optional<Integer> activePid = Stream.of(output.split("\n")).
                    filter(eachLine -> eachLine.contains(":" + port + SEPARATOR)).
                    findFirst().
                    map(each -> fetchPidFromNetstatOuput(each));

            if (activePid.isPresent()) {
                log.debug("found pid : [{}], for active process with port : [{}]", activePid.get(), port);
            } else {
                log.warn("There is no active process with such port : [{}]", port);
            }
            return activePid;

        } catch (Exception e) {
            log.error("Error while fetching pid by port", e);
            return Optional.empty();
        }
    }

    /**
     * Scan ps to find active process's pid, check if that process holds the port, kill all zombie processes
     *
     * @param innerString process name (example : 'haproxy')
     * @return Optional of pid
     */
    public Optional<Integer> getActiveProcessPidsAndKillZombieProcess(final String innerString, final Integer port) {
        log.info("Inner string : [{}], port : [{}]", innerString, port);
        try {
            ProcessResult processResult = executorProxy.execute("ps", "ax");
            String output = processResult.outputUTF8();

            Stream<String> linesStream = Stream.of(output.split("\n"));

            List<Integer> processList = linesStream.
                    filter(eachLine -> eachLine.contains(innerString)).
                    map(each -> fetchPidFromPsOutput(each)).collect(Collectors.toList());

            if (processList.isEmpty()) {
                log.debug("empty process list");
                return Optional.empty();
            }
            final Optional<Integer> activePid = getPidOfProcessByPort(port);

            Stream<Integer> zombiProcess = processList.stream().filter(each -> !each.equals(activePid.orElse(Integer.MIN_VALUE)));
            Optional<Integer> activeProcess = processList.stream().
                    filter(each -> each.equals(activePid.orElse(Integer.MIN_VALUE))).findAny();

            zombiProcess.forEach(each -> {
                log.debug("kill zombie with pid : [{}]", each);
                killProcess(each);
            });

            if (!activeProcess.isPresent()) {
                log.debug("there were only zombies, I killed them all");
            }

            return activeProcess;

        } catch (Exception e) {
            log.error("Error while getProcessPids", e);
            return Optional.empty();
        }
    }

    private boolean killProcess(final Integer pid) {
        log.info("Pid : [{}]", pid);
        try {
            ProcessResult processResult = executorProxy.execute("kill", pid.toString());
            int exitValue = processResult.getExitValue();
            if (exitValue != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            log.error("Error while killing the process", e);
            return false;
        }

    }

    private int fetchPidFromPsOutput(final String sourceString) {
        log.debug("source string : [{}]", sourceString);
        String trimStr = sourceString.trim();
        int firstSpaceIndex = trimStr.indexOf(SEPARATOR);
        String targetPid = trimStr.substring(0, firstSpaceIndex);
        int result = Integer.valueOf(targetPid);
        log.debug("fetchPidFromPsOutput : result pid : [{}]", result);
        return result;
    }

    private Integer fetchPidFromNetstatOuput(final String sourceString) {
        log.debug("source string : [{}]", sourceString);
        try {
            String trimStr = sourceString.trim();
            int lastSpaceIndex = trimStr.lastIndexOf(SEPARATOR);
            int lastSlashIndex = trimStr.lastIndexOf('/');
            return Integer.valueOf(trimStr.substring(++lastSpaceIndex, lastSlashIndex));
        } catch (Exception e) {
            log.warn("Error while parsing netstat string : " + sourceString);
            return null;
        }
    }

    /**
     * Execute some command
     *
     * @param command command to execute
     * @return exit value
     */
    public Optional<Integer> executeCommand(final String... command) {
        log.info("command : [{}]", Arrays.toString(command));
        try {
            ProcessResult processResult = executorProxy.execute(command);

            log.debug("exit code : [{}], command : [{}]", processResult.getExitValue(), String.join(LOG_SEPARATOR, command));

            return Optional.of(processResult.getExitValue());

        } catch (Exception e) {
            log.error("Error while execute command : [" + String.join(LOG_SEPARATOR, command) + "]", e);
            return Optional.empty();
        }
    }

}
