package ru.angrytit.servitor.process;

import org.springframework.stereotype.Component;
import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.ProcessResult;
import org.zeroturnaround.exec.stream.slf4j.Slf4jStream;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Proxy for org.zeroturnaround.exec.ProcessExecutor (needed for testing)
 * <p/>
 * Created by Mikhail Tyamin
 */
@Component
public class ProcessExecutorWrapper {

    public ProcessResult execute(final String... command) throws InterruptedException, TimeoutException, IOException {
        return new ProcessExecutor().command(command).
                redirectOutput(Slf4jStream.of(getClass()).asDebug()).
                readOutput(true).execute();
    }
}
