package ru.angrytit.servitor.gateways;

import java.util.List;

/**
 * Gateway to Amazon EC2 service
 * <p>
 * Created by Mikhail Tyamin
 */
public interface EC2Gateway {

    /**
     * Return a list of server's public dns by their instance's ids
     *
     * @param instanceIds list of instance's ids
     * @return list of server's public dns or empty list
     */
    List<String> fetchServerPublicDnsList(List<String> instanceIds);

    /**
     * Return a list of server's private dns by their instance's ids
     *
     * @param instanceIds list of instance's ids
     * @return list of server's private dns or empty list
     */
    List<String> fetchServerPrivateDnsList(List<String> instanceIds);
}
