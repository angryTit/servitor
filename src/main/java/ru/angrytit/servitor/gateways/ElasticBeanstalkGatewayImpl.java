package ru.angrytit.servitor.gateways;

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticbeanstalk.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Mikhail Tyamin
 */
@Service
class ElasticBeanstalkGatewayImpl implements ElasticBeanstalkGateway {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private final AWSElasticBeanstalk elasticBeanstalkClient;

    @Autowired
    public ElasticBeanstalkGatewayImpl(AWSElasticBeanstalk elasticBeanstalkClient) {
        this.elasticBeanstalkClient = elasticBeanstalkClient;
    }

    @Override
    public Optional<EnvironmentDescription> findEnvironment(final String currentProdUrl) {
        log.info("currentProdUrl : [{}]", currentProdUrl);
        DescribeEnvironmentsResult describeEnvironmentsResult = elasticBeanstalkClient.describeEnvironments();
        List<EnvironmentDescription> environmentDescriptions = describeEnvironmentsResult.getEnvironments();

        Optional<EnvironmentDescription> result = environmentDescriptions.stream().
                filter(each -> {
                    log.debug("env. CNAME : [{}], env. id : [{}]", each.getCNAME(), each.getEnvironmentId());
                    return each.getCNAME().equals(currentProdUrl) &&
                            each.getStatus().equals(EnvironmentStatus.Ready.toString());
                }).
                findAny();
        if (!result.isPresent()) {
            log.warn("there is no such env. with CNAME : [{}] in state : [{}]", currentProdUrl, EnvironmentStatus.Ready.toString());
        }
        return result;
    }

    @Override
    public List<String> fetchInstanceIds(final EnvironmentDescription env) {
        log.info("env. name : [{}]", env.getEnvironmentName());
        DescribeEnvironmentResourcesRequest resourcesRequest = new DescribeEnvironmentResourcesRequest().
                withEnvironmentName(env.getEnvironmentName()).
                withEnvironmentId(env.getEnvironmentId());

        DescribeEnvironmentResourcesResult resourcesResult = elasticBeanstalkClient.describeEnvironmentResources(resourcesRequest);
        EnvironmentResourceDescription resourceDescription = resourcesResult.getEnvironmentResources();
        List<Instance> instances = resourceDescription.getInstances();

        return instances.stream().map(each ->
        {
            log.debug("instance id : [{}]", each.getId());
            return each.getId();
        }).collect(Collectors.toList());

    }

}
