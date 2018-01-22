package ru.angrytit.servitor.process;

import ru.angrytit.servitor.ServitorApplication;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.zeroturnaround.exec.ProcessOutput;
import org.zeroturnaround.exec.ProcessResult;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

/**
 * Created by Mikhail Tyamin
 */
@SpringApplicationConfiguration(classes = ServitorApplication.class)
public class ProcessUtilsTest extends AbstractTestNGSpringContextTests {

    @InjectMocks
    private ProcessUtils processUtils;

    @Mock
    private ProcessExecutorWrapper processExecutorWrapper;

    @BeforeClass
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetActiveProcessPidsAndKillZombieProcessIsEmpty() throws Exception {
        ProcessOutput output = new ProcessOutput(ProcessOutputConst.PS_AX_OUTPUT_WITHOUT_HAPROXY.getByteOutputArr());
        ProcessResult result = new ProcessResult(0, output);
        when(processExecutorWrapper.execute("ps", "ax")).thenReturn(result);
        assertFalse(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", 3306).isPresent(), "Result is not null");
    }

    @Test
    public void testGetActiveProcessPidsAndKillZombieProcessNoActiveProcess() throws Exception {
        ProcessOutput psOutput = new ProcessOutput(ProcessOutputConst.PS_AX_OUTPUT_WITH_NOT_ACTIVE_HAPROXY.getByteOutputArr());
        ProcessResult psResult = new ProcessResult(0, psOutput);
        when(processExecutorWrapper.execute("ps", "ax")).thenReturn(psResult);

        ProcessOutput netstatOutput = new ProcessOutput(ProcessOutputConst.NETSTAT_OUTPUT_WITH_ONE_HAPROXY_ON_3306_PORT.getByteOutputArr());
        ProcessResult netStatResult = new ProcessResult(0, netstatOutput);
        when(processExecutorWrapper.execute("netstat", "-apn")).thenReturn(netStatResult);

        when(processExecutorWrapper.execute("kill", "95343")).thenReturn(new ProcessResult(0, null));
        when(processExecutorWrapper.execute("kill", "95345")).thenReturn(new ProcessResult(0, null));
        assertFalse(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", 3306).isPresent(), "Result is not null");
    }

    @Test
    public void testGetActiveProcessPidsAndKillZombieProcessOneActiveProcess() throws Exception {
        ProcessOutput psOutput = new ProcessOutput(ProcessOutputConst.PS_AX_OUTPUT_WITH_ONE_ACTIVE_HAPROXY.getByteOutputArr());
        ProcessResult psResult = new ProcessResult(0, psOutput);
        when(processExecutorWrapper.execute("ps", "ax")).thenReturn(psResult);

        ProcessOutput netstatOutput = new ProcessOutput(ProcessOutputConst.NETSTAT_OUTPUT_WITH_ONE_HAPROXY_ON_3306_PORT.getByteOutputArr());
        ProcessResult netStatResult = new ProcessResult(0, netstatOutput);
        when(processExecutorWrapper.execute("netstat", "-apn")).thenReturn(netStatResult);

        when(processExecutorWrapper.execute("kill", "95343")).thenReturn(new ProcessResult(0, null));

        assertEquals(Integer.valueOf(2442), processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", 3306).get());
    }

    @Test
    public void testGetActiveProcessPidsAndKillZombieProcessOneActiveProcessWithNoRealProcess() throws Exception {
        ProcessOutput psOutput = new ProcessOutput(ProcessOutputConst.PS_AX_OUTPUT_WITH_ONE_ACTIVE_HAPROXY.getByteOutputArr());
        ProcessResult psResult = new ProcessResult(0, psOutput);
        when(processExecutorWrapper.execute("ps", "ax")).thenReturn(psResult);

        ProcessOutput netstatOutput = new ProcessOutput(ProcessOutputConst.NETSTAT_OUTPUT_WITH_NO_HAPROXY_ON_3306_PORT.getByteOutputArr());
        ProcessResult netStatResult = new ProcessResult(0, netstatOutput);
        when(processExecutorWrapper.execute("netstat", "-apn")).thenReturn(netStatResult);

        when(processExecutorWrapper.execute("kill", "95343")).thenReturn(new ProcessResult(0, null));
        when(processExecutorWrapper.execute("kill", "2442")).thenReturn(new ProcessResult(0, null));

        assertFalse(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", 3306).isPresent(), "Pid is presented");

    }

}
