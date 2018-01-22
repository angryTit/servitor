package ru.angrytit.servitor.balancer;

import ru.angrytit.servitor.ServitorApplication;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;


/**
 * Created by Mikhail Tyamin
 */
@SpringApplicationConfiguration(classes = ServitorApplication.class)
public class HAProxyLoadBalancerWithouMockImplTest extends AbstractTestNGSpringContextTests {

    private static final String PREPARED_FILE = "./src/test/resources/junit-haproxy.cfg";

    @Autowired
    private HAProxyLoadBalancer haProxyConfigGateway;

    @Value("${prod.haproxy.files.path}")
    private String haproxyFilesPath;

    @Value("${prod.haproxy.config.file.name}")
    private String haproxyConfigFileName;

    @Test
    public void testUpdateConfiguration() throws Exception {
        List<String> servers = new ArrayList<>();
        servers.add("server1");
        servers.add("server2");
        servers.add("server3");

        File resultFile = new File(haproxyFilesPath + "/" + haproxyConfigFileName);

        try {
            assertTrue(haProxyConfigGateway.updateConfiguration(servers), "Error during update configuration");
            assertTrue(FileUtils.contentEquals(resultFile, new File(PREPARED_FILE)), "Files content is not equals");
        } finally {
            if (resultFile.exists()) {
                FileUtils.forceDelete(resultFile);
            }
        }
    }
}
