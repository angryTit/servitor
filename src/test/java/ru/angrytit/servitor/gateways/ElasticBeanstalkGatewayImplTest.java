package ru.angrytit.servitor.gateways;

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticbeanstalk.model.*;
import ru.angrytit.servitor.ServitorApplication;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;

import static org.mockito.Mockito.when;
import static org.testng.Assert.*;


/**
 * Created by Mikhail Tyamin
 */
@SpringApplicationConfiguration(classes = ServitorApplication.class)
public class ElasticBeanstalkGatewayImplTest extends AbstractTestNGSpringContextTests {

    private static final String PROD_URL = "http://godaktor.com";
    private static final String PROD_ENV_ID = "PROD_ENV_ID";
    private static final String PROD_ENV_NAME = "PROD_ENV_NAME";
    private static final String STAGE_URL = "http://godaktor-stage.com";
    private static final String STAGE_ENV_ID = "STAGE_ENV_ID";
    private static final String STAGE_ENV_NAME = "STAGE_ENV_ID";

    private static final DescribeEnvironmentsResult DESCRIBE_ENVIRONMENTS_RESULT_IN_READY_STATE;
    private static final DescribeEnvironmentsResult DESCRIBE_ENVIRONMENTS_RESULT_IN_UPDATING_STATE;
    private static final DescribeEnvironmentsResult DESCRIBE_ENVIRONMENTS_RESULT_EMPTY;

    private static final EnvironmentDescription ENVIRONMENT_DESCRIPTION_IN_READY_STATE_PROD;
    private static final EnvironmentDescription ENVIRONMENT_DESCRIPTION_IN_READY_STATE_STAGE;

    private static final DescribeEnvironmentResourcesRequest RESOURCES_REQUEST_PROD;
    private static final DescribeEnvironmentResourcesRequest RESOURCES_REQUEST_STAGE;

    private static final DescribeEnvironmentResourcesResult RESOURCES_RESULT_PROD;
    private static final DescribeEnvironmentResourcesResult RESOURCES_RESULT_STAGE;

    private static final DescribeEnvironmentResourcesResult RESOURCES_RESULT_EMPTY;

    private static final List<Instance> INSTANCES_PROD;
    private static final List<Instance> INSTANCES_STAGE;

    static {
        List<EnvironmentDescription> ready_list = new ArrayList<>();
        ready_list.add(new EnvironmentDescription().withCNAME(PROD_URL).withEnvironmentId(PROD_ENV_ID).withStatus(EnvironmentStatus.Ready));
        ready_list.add(new EnvironmentDescription().withCNAME(STAGE_URL).withEnvironmentId(STAGE_ENV_ID).withStatus(EnvironmentStatus.Ready));
        DESCRIBE_ENVIRONMENTS_RESULT_IN_READY_STATE = new DescribeEnvironmentsResult().withEnvironments(ready_list);

        List<EnvironmentDescription> updating_list = new ArrayList<>();
        updating_list.add(new EnvironmentDescription().withCNAME(PROD_URL).withEnvironmentId(PROD_ENV_ID).withStatus(EnvironmentStatus.Updating));
        updating_list.add(new EnvironmentDescription().withCNAME(STAGE_URL).withEnvironmentId(STAGE_ENV_ID).withStatus(EnvironmentStatus.Updating));
        DESCRIBE_ENVIRONMENTS_RESULT_IN_UPDATING_STATE = new DescribeEnvironmentsResult().withEnvironments(updating_list);

        DESCRIBE_ENVIRONMENTS_RESULT_EMPTY = new DescribeEnvironmentsResult().withEnvironments(Collections.emptyList());

        ENVIRONMENT_DESCRIPTION_IN_READY_STATE_PROD = new EnvironmentDescription().
                withEnvironmentId(PROD_ENV_ID).
                withEnvironmentName(PROD_ENV_NAME).
                withStatus(EnvironmentStatus.Ready);

        ENVIRONMENT_DESCRIPTION_IN_READY_STATE_STAGE = new EnvironmentDescription().
                withEnvironmentId(STAGE_ENV_ID).
                withEnvironmentName(STAGE_ENV_NAME).
                withStatus(EnvironmentStatus.Ready);

        RESOURCES_REQUEST_PROD = new DescribeEnvironmentResourcesRequest().
                withEnvironmentId(PROD_ENV_ID).
                withEnvironmentName(PROD_ENV_NAME);

        RESOURCES_REQUEST_STAGE = new DescribeEnvironmentResourcesRequest().
                withEnvironmentId(STAGE_ENV_ID).
                withEnvironmentName(STAGE_ENV_NAME);

        INSTANCES_PROD = new ArrayList<>();
        INSTANCES_PROD.add(new Instance().withId("instance_id_prod_1"));
        INSTANCES_PROD.add(new Instance().withId("instance_id_prod_2"));
        INSTANCES_PROD.add(new Instance().withId("instance_id_prod_3"));

        INSTANCES_STAGE = new ArrayList<>();
        INSTANCES_STAGE.add(new Instance().withId("instance_id_stage_1"));
        INSTANCES_STAGE.add(new Instance().withId("instance_id_stage_2"));
        INSTANCES_STAGE.add(new Instance().withId("instance_id_stage_3"));

        RESOURCES_RESULT_PROD = new DescribeEnvironmentResourcesResult().
                withEnvironmentResources(new EnvironmentResourceDescription().withInstances(INSTANCES_PROD));

        RESOURCES_RESULT_STAGE = new DescribeEnvironmentResourcesResult().
                withEnvironmentResources(new EnvironmentResourceDescription().withInstances(INSTANCES_STAGE));

        RESOURCES_RESULT_EMPTY = new DescribeEnvironmentResourcesResult().
                withEnvironmentResources(new EnvironmentResourceDescription().withInstances(Collections.emptyList()));

    }

    @InjectMocks
    private ElasticBeanstalkGatewayImpl elasticBeanstalkGateway;

    @Mock
    private AWSElasticBeanstalk awsElasticBeanstalkClient;

    @BeforeClass
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void tetsfindEnvironment_envInReadyState() {
        when(awsElasticBeanstalkClient.describeEnvironments()).thenReturn(DESCRIBE_ENVIRONMENTS_RESULT_IN_READY_STATE);

        Optional<EnvironmentDescription> env = elasticBeanstalkGateway.findEnvironment(PROD_URL);
        assertEquals(env.get().getEnvironmentId(), PROD_ENV_ID, "Wrong prod env. id");

        env = elasticBeanstalkGateway.findEnvironment(STAGE_URL);
        assertEquals(env.get().getEnvironmentId(), STAGE_ENV_ID, "Wrong stage env. id");

        env = elasticBeanstalkGateway.findEnvironment(UUID.randomUUID().toString());
        assertFalse(env.isPresent(), "Env. is not null");
    }

    @Test
    public void tetsfindEnvironment_envInUpdatingState() {
        when(awsElasticBeanstalkClient.describeEnvironments()).thenReturn(DESCRIBE_ENVIRONMENTS_RESULT_IN_UPDATING_STATE);

        Optional<EnvironmentDescription> env = elasticBeanstalkGateway.findEnvironment(PROD_URL);
        assertFalse(env.isPresent(), "Env. is presented");

        env = elasticBeanstalkGateway.findEnvironment(STAGE_URL);
        assertFalse(env.isPresent(), "Env. is presented");

        env = elasticBeanstalkGateway.findEnvironment(UUID.randomUUID().toString());
        assertFalse(env.isPresent(), "Env. is not null");
    }

    @Test
    public void tetsfindEnvironment_envEmpty() {
        when(awsElasticBeanstalkClient.describeEnvironments()).thenReturn(DESCRIBE_ENVIRONMENTS_RESULT_EMPTY);

        Optional<EnvironmentDescription> env = elasticBeanstalkGateway.findEnvironment(PROD_URL);
        assertFalse(env.isPresent(), "Env. is presented");

        env = elasticBeanstalkGateway.findEnvironment(STAGE_URL);
        assertFalse(env.isPresent(), "Env. is presented");

        env = elasticBeanstalkGateway.findEnvironment(UUID.randomUUID().toString());
        assertFalse(env.isPresent(), "Env. is not null");
    }

    @Test
    public void testReadServerList() throws Exception {
        when(awsElasticBeanstalkClient.describeEnvironmentResources(RESOURCES_REQUEST_PROD)).thenReturn(RESOURCES_RESULT_PROD);
        when(awsElasticBeanstalkClient.describeEnvironmentResources(RESOURCES_REQUEST_STAGE)).thenReturn(RESOURCES_RESULT_STAGE);

        List<String> prodInstancesId = elasticBeanstalkGateway.fetchInstanceIds(ENVIRONMENT_DESCRIPTION_IN_READY_STATE_PROD);
        makeCheck(prodInstancesId, INSTANCES_PROD);

        List<String> stageInstanceIds = elasticBeanstalkGateway.fetchInstanceIds(ENVIRONMENT_DESCRIPTION_IN_READY_STATE_STAGE);
        makeCheck(stageInstanceIds, INSTANCES_STAGE);
    }

    @Test
    public void testReadEmptyServerList() throws Exception {
        when(awsElasticBeanstalkClient.describeEnvironmentResources(RESOURCES_REQUEST_PROD)).thenReturn(RESOURCES_RESULT_EMPTY);
        when(awsElasticBeanstalkClient.describeEnvironmentResources(RESOURCES_REQUEST_STAGE)).thenReturn(RESOURCES_RESULT_EMPTY);

        List<String> prodInstancesId = elasticBeanstalkGateway.fetchInstanceIds(ENVIRONMENT_DESCRIPTION_IN_READY_STATE_PROD);
        assertTrue(prodInstancesId.isEmpty(), "Result is not empty");

        List<String> stageInstanceIds = elasticBeanstalkGateway.fetchInstanceIds(ENVIRONMENT_DESCRIPTION_IN_READY_STATE_STAGE);
        assertTrue(stageInstanceIds.isEmpty(), "Result is not empty");
    }

    private void makeCheck(final List<String> actualIds, final List<Instance> instances) {
        for (Instance each : instances) {
            assertTrue(actualIds.contains(each.getId()), "Wrong instance id");
        }
        assertEquals(actualIds.size(), instances.size(), "Different size");
    }
}
