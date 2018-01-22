package ru.angrytit.servitor.balancer;

import ru.angrytit.servitor.ServitorApplication;
import ru.angrytit.servitor.process.ProcessUtils;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertTrue;

/**
 * Created by Mikhail Tyamin
 */
@SpringApplicationConfiguration(classes = ServitorApplication.class)
public class HAProxyLoadBalancerImpMockTest extends AbstractTestNGSpringContextTests {

    @Mock
    private ProcessUtils processUtils;

    @InjectMocks
    private HAProxyLoadBalancer haProxyConfigGatewayMock;

    private static final String[] runHAProxyService = new String[]{"service", "haproxy", "start"};
    private static final String[] restartHAProxyService = new String[]{"service", "haproxy", "restart"};
    private static final String[] ipTablePreRestartHAProxyCommand = new String[]{"iptables", "-I", "INPUT",
            "-p", "tcp", "--dport", "80", "--syn", "-j", "DROP"};
    private static final String[] sleepCommand = new String[]{"sleep", "1"};
    private static final String[] ipTablePostRestartHAProxyCommand = new String[]{"iptables", "-D", "INPUT",
            "-p", "tcp", "--dport", "80", "--syn", "-j", "DROP"};

    @BeforeClass
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testStartLoadBalancerProcessWithoutRestartAndAlreadyRunningProcess() throws Exception {
        when(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", null)).
                thenReturn(Optional.of(22));
        assertTrue(haProxyConfigGatewayMock.startLoadBalancerProcess(false));
    }

    @Test
    public void testStartLoadBalancerProcessWithRestartAndAlreadyRunningProcess() throws Exception {
        when(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", null)).
                thenReturn(Optional.of(22));
        when(processUtils.executeCommand(restartHAProxyService)).thenReturn(Optional.of(0));
        when(processUtils.executeCommand(ipTablePostRestartHAProxyCommand)).thenReturn(Optional.of(0));
        when(processUtils.executeCommand(ipTablePreRestartHAProxyCommand)).thenReturn(Optional.of(0));
        when(processUtils.executeCommand(sleepCommand)).thenReturn(Optional.of(0));
        when(processUtils.executeCommand(runHAProxyService)).thenReturn(Optional.empty());

        assertTrue(haProxyConfigGatewayMock.startLoadBalancerProcess(true));
    }

    @Test
    public void testStartLoadBalancerProcessWithoutRestartAndWithoutAlreadyRunningProcess() throws Exception {
        when(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", null)).
                thenReturn(Optional.empty());
        when(processUtils.executeCommand(restartHAProxyService)).thenReturn(Optional.empty());
        when(processUtils.executeCommand(runHAProxyService)).thenReturn(Optional.of(0));

        assertTrue(haProxyConfigGatewayMock.startLoadBalancerProcess(false));
    }

    @Test
    public void testStartLoadBalancerProcessWithRestartAndWithoutAlreadyRunningProcess() throws Exception {
        when(processUtils.getActiveProcessPidsAndKillZombieProcess("haproxy", null)).
                thenReturn(Optional.empty());
        when(processUtils.executeCommand(restartHAProxyService)).thenReturn(Optional.empty());
        when(processUtils.executeCommand(runHAProxyService)).thenReturn(Optional.of(0));

        assertTrue(haProxyConfigGatewayMock.startLoadBalancerProcess(true));
    }
}
