package ru.angrytit.servitor.gateways;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import ru.angrytit.servitor.ServitorApplication;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertTrue;

/**
 * Created by Mikhail Tyamin
 */
@SpringApplicationConfiguration(classes = ServitorApplication.class)
public class EC2GatewayImplTest extends AbstractTestNGSpringContextTests {

    private static final List<String> INSTANCE_IDS;

    private static final DescribeInstancesRequest DESCRIBE_INSTANCES_REQUEST;

    private static final DescribeInstancesResult DESCRIBE_INSTANCES_RESULT;
    private static final List<Reservation> RESERVATION_LIST;
    private static final Reservation RESERVATION;
    private static final List<Instance> INSTANCES;

    private static final List<String> RESULT;

    static {

        INSTANCE_IDS = new ArrayList<>();
        INSTANCE_IDS.add("instance_id_1");
        INSTANCE_IDS.add("instance_id_2");
        INSTANCE_IDS.add("instance_id_3");


        DESCRIBE_INSTANCES_REQUEST = new DescribeInstancesRequest().
                withInstanceIds("instance_id_1", "instance_id_2", "instance_id_3");

        INSTANCES = new ArrayList<>();
        INSTANCES.add(new Instance().
                withState(new InstanceState().withName(EC2GatewayImpl.INSTANCE_RUNNING_STATE)).
                withPublicDnsName("public_dns_1").
                withInstanceId("instance_id_1"));

        INSTANCES.add(new Instance().
                withState(new InstanceState().withName("pending")).
                withPublicDnsName("public_dns_2").
                withInstanceId("instance_id_2"));

        INSTANCES.add(new Instance().
                withState(new InstanceState().withName(EC2GatewayImpl.INSTANCE_RUNNING_STATE)).
                withPublicDnsName("public_dns_3").
                withInstanceId("instance_id_3"));

        RESERVATION = new Reservation().withInstances(INSTANCES);

        RESERVATION_LIST = new ArrayList<>();
        RESERVATION_LIST.add(RESERVATION);

        DESCRIBE_INSTANCES_RESULT = new DescribeInstancesResult().withReservations(RESERVATION_LIST);

        RESULT = new ArrayList<>();
        RESULT.add("public_dns_1");
        RESULT.add("public_dns_3");
    }

    @InjectMocks
    private EC2GatewayImpl ec2Gateway;

    @Mock
    private AmazonEC2 amazonEC2;

    @BeforeClass
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFetchServerPublicDnsList() throws Exception {
        when(amazonEC2.describeInstances(DESCRIBE_INSTANCES_REQUEST)).thenReturn(DESCRIBE_INSTANCES_RESULT);

        List<String> publicDnsList = ec2Gateway.fetchServerPublicDnsList(INSTANCE_IDS);
        assertTrue(publicDnsList.size() == RESULT.size(), "Different size");
        for (String each : publicDnsList) {
            assertTrue(RESULT.contains(each), "Wrong dns");
        }
    }

    @Test
    public void testFetchServerPublicDnsListEmptyList() throws Exception {
        when(amazonEC2.describeInstances(DESCRIBE_INSTANCES_REQUEST)).
                thenReturn(new DescribeInstancesResult().withReservations(new ArrayList<Reservation>()));

        List<String> publicDnsList = ec2Gateway.fetchServerPublicDnsList(INSTANCE_IDS);
        assertTrue(publicDnsList.isEmpty(), "Different size");
    }

}
