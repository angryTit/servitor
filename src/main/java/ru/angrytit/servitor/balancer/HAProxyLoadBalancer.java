package ru.angrytit.servitor.balancer;

import ru.angrytit.servitor.process.ProcessUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Mikhail Tyamin
 */
@Service
class HAProxyLoadBalancer implements LoadBalancer {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final String ITEMS_NAME = "items";
    private static final String SEPARATOR = " | ";

    private final Configuration configuration;
    private final String haproxyFilesPath;
    private final String haproxyConfigFileName;
    private final String templateName;
    private final ProcessUtils processUtils;
    private final String[] runHAProxyServiceCommand;
    private final String[] restartHAProxyServiceCommand;
    private final String[] ipTablePreRestartHAProxyCommand;
    private final String[] ipTablePostRestartHAProxyCommand;
    private final String[] sleepCommand;
    private final Integer listenClusterPort;


    @Autowired
    public HAProxyLoadBalancer(Configuration configuration,
                               ProcessUtils processUtils,
                               @Value("${prod.haproxy.files.path}") String haproxyFilesPath,
                               @Value("${prod.haproxy.config.file.name}") String haproxyConfigFileName,
                               @Value("${prod.haproxy.config.template.name}") String templateName,
                               @Value("${prod.haproxy.config.listen.cluster.port}") Integer listenClusterPort) {
        this.configuration = configuration;
        this.haproxyFilesPath = haproxyFilesPath;
        this.haproxyConfigFileName = haproxyConfigFileName;
        this.templateName = templateName;
        this.runHAProxyServiceCommand = new String[]{"service", "haproxy", "start"};
        this.restartHAProxyServiceCommand = new String[]{"service", "haproxy", "restart"};
        //iptables -I INPUT -p tcp --dport $PORT --syn -j DROP
        this.ipTablePreRestartHAProxyCommand = new String[]{"iptables", "-I", "INPUT", "-p", "tcp", "--dport",
                listenClusterPort != null ? listenClusterPort.toString() : "80", "--syn", "-j", "DROP"};
        //sleep 1
        this.sleepCommand = new String[]{"sleep", "1"};
        //iptables -D INPUT -p tcp --dport $PORT --syn -j DROP
        this.ipTablePostRestartHAProxyCommand = new String[]{"iptables", "-D", "INPUT", "-p", "tcp", "--dport",
                listenClusterPort != null ? listenClusterPort.toString() : "80", "--syn", "-j", "DROP"};
        this.processUtils = processUtils;
        this.listenClusterPort = listenClusterPort;
    }

    @Override
    public boolean updateConfiguration(final List<String> servers) {
        log.info("Servers : [{}]", String.join(SEPARATOR, servers));
        FileWriter fileWriter = null;
        try {
            Template template = configuration.getTemplate(templateName, "UTF-8");
            Map<String, List<String>> dataModel = new HashMap<>();
            dataModel.put(ITEMS_NAME, servers);
            fileWriter = new FileWriter(haproxyFilesPath + "/" + haproxyConfigFileName);
            template.process(dataModel, fileWriter);
            return true;
        } catch (Exception ex) {
            log.error("Error during update config file", ex);
            return false;
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    log.error("Error while closing file writer", e);
                }
            }
        }
    }

    @Override
    public boolean startLoadBalancerProcess(final boolean restartIfExist) {
        log.info("Restart if exist : [{}]", restartIfExist);
        Optional<Integer> pid = processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", listenClusterPort);

        //Process already exist and we don't need to restart it
        if (pid.isPresent() && !restartIfExist) {
            return true;
        }
        String[] commandToExecute;
        if (pid.isPresent() && restartIfExist) {
            //Process already exist, but we need to restart it
            return
                    execute(ipTablePreRestartHAProxyCommand) &&
                            execute(sleepCommand) &&
                            execute(restartHAProxyServiceCommand) &&
                            execute(ipTablePostRestartHAProxyCommand);
        } else {
            //Process does not exist, so we need to start it
            commandToExecute = runHAProxyServiceCommand;
        }

        Optional<Integer> exitCode = processUtils.executeCommand(commandToExecute);
        return exitCode.orElse(Integer.MIN_VALUE) != 0 ? false : true;
    }

    private boolean execute(final String[] command) {
        Optional<Integer> exitCode = processUtils.executeCommand(command);
        if (exitCode.orElse(Integer.MIN_VALUE) != 0) {
            return false;
        }
        return true;
    }

}
