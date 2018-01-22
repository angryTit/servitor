package ru.angrytit.servitor.services;

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentDescription;
import ru.angrytit.servitor.balancer.LoadBalancer;
import ru.angrytit.servitor.gateways.EC2Gateway;
import ru.angrytit.servitor.gateways.ElasticBeanstalkGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mikhail Tyamin
 */
@Service
public class MonitorSchedulerService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private final ElasticBeanstalkGateway elasticBeanstalkGateway;
    private final LoadBalancer loadBalancer;
    private final EC2Gateway ec2Gateway;
    private final String prodUrl;

    private List<String> currentServerList;

    @Autowired
    public MonitorSchedulerService(ElasticBeanstalkGateway elasticBeanstalkGateway,
                                   EC2Gateway ec2Gateway,
                                   LoadBalancer loadBalancer,
                                   @Value("${prod.url}") String prodUrl) {
        this.elasticBeanstalkGateway = elasticBeanstalkGateway;
        this.loadBalancer = loadBalancer;
        this.ec2Gateway = ec2Gateway;
        this.prodUrl = prodUrl;
    }

    @Scheduled(fixedDelay = 60_000L, initialDelay = 10_000L)
    public void scheduleCheck() {
        log.info("start update at : [{}]", LocalDateTime.now());
        updateLoadBalancerConfigurationIfNeeded(prodUrl);
    }

    public void updateLoadBalancerConfigurationIfNeeded(final String url) {
        log.info("url : [{}]", url);
        try {
            Optional<EnvironmentDescription> env = elasticBeanstalkGateway.findEnvironment(url);
            if (!env.isPresent()) {
                log.warn("there is no env. with given prod. url : [{}]", url);
                return;
            }
            List<String> instanceIds = elasticBeanstalkGateway.fetchInstanceIds(env.get());
            List<String> servers = ec2Gateway.fetchServerPrivateDnsList(instanceIds);
            if (servers.isEmpty()) {
                log.info("there is no active server in env. : [{}], don't need to update configuration",
                        env.get());
                return;
            }
            Collections.sort(servers);
            if (currentServerList != null && currentServerList.equals(servers)) {
                log.info("the same list of servers, don't need to update configuration");
                return;
            }
            currentServerList = servers;
            boolean result = loadBalancer.updateConfiguration(servers);
            if (!result) {
                log.warn("there was an error during configuration update," +
                        " don't need to start/restart load-balancer");
                return;
            }
            //start haproxy (restart if already running)
            result = loadBalancer.startLoadBalancerProcess(true);
            if (!result) {
                log.warn("unsuccessful attempt to restart load-balancer");
            } else {
                log.info("load-balancer was successfully restarted");
            }
        } catch (Exception ex) {
            log.error("Error during checking configuration", ex);
        }
    }

}
