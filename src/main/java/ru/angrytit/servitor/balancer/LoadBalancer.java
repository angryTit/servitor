package ru.angrytit.servitor.balancer;

import java.util.List;

/**
 * Gateway to local load-balancer. It could be HAProxy and etc.
 * <p/>
 * Created by Mikhail Tyamin
 */
public interface LoadBalancer {

    /**
     * Update load-balancer's configuration to use list of servers
     *
     * @param servers server list
     * @return true or false (if application could not update config file)
     */
    boolean updateConfiguration(List<String> servers);

    /**
     * Start (restart if needed) load balancer
     *
     * @param restartIfExist restart if already running
     * @return true or false
     */
    boolean startLoadBalancerProcess(boolean restartIfExist);
}
