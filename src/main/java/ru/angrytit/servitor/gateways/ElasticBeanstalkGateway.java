package ru.angrytit.servitor.gateways;

import com.amazonaws.services.elasticbeanstalk.model.EnvironmentDescription;

import java.util.List;
import java.util.Optional;

/**
 * Gateway to Amazon Elastic Beanstalk service
 * <p/>
 * Created by Mikhail Tyamin
 */
public interface ElasticBeanstalkGateway {

    /**
     * Return environment's description by given url
     *
     * @param currentProdUrl production url
     * @return Optional of environment's description
     */
    Optional<EnvironmentDescription> findEnvironment(String currentProdUrl);

    /**
     * Return list of server's instance ids in given environment
     *
     * @param env environment description
     * @return list of instance's ids or empty list
     */
    List<String> fetchInstanceIds(EnvironmentDescription env);

}
