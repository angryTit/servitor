package ru.angrytit.servitor.gateways;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Mikhail Tyamin
 */
@Service
class EC2GatewayImpl implements EC2Gateway {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final String SEPARATOR = " | ";

    public static final String INSTANCE_RUNNING_STATE = "running";

    private final AmazonEC2 amazonEC2;

    @Autowired
    public EC2GatewayImpl(AmazonEC2 amazonEC2) {
        this.amazonEC2 = amazonEC2;
    }

    @Override
    public List<String> fetchServerPublicDnsList(final List<String> instanceIds) {
        log.info("Fetch public dns list for instance ids : [{}]", String.join(SEPARATOR, instanceIds));
        if (instanceIds.isEmpty()) {
            return Collections.emptyList();
        }

        return fetchDnsList(instanceIds, instance -> instance.getPublicDnsName());
    }

    @Override
    public List<String> fetchServerPrivateDnsList(final List<String> instanceIds) {
        log.info("Fetch private dns list for instance ids : [{}]", String.join(SEPARATOR, instanceIds));
        if (instanceIds.isEmpty()) {
            return Collections.emptyList();
        }

        return fetchDnsList(instanceIds, instance -> instance.getPrivateDnsName());
    }

    private List<String> fetchDnsList(final List<String> instanceIds, Function<Instance, String> mapper) {
        DescribeInstancesRequest describeInstancesRequest = new DescribeInstancesRequest().withInstanceIds(instanceIds);
        DescribeInstancesResult describeInstancesResult = amazonEC2.describeInstances(describeInstancesRequest);
        List<Reservation> reservations = describeInstancesResult.getReservations();

        return reservations.stream().
                flatMap(eachReservation -> eachReservation.getInstances().stream()).
                filter(eachInstance -> eachInstance.getState().getName().equals(INSTANCE_RUNNING_STATE)).
                map(mapper).
                collect(Collectors.toList());
    }
}
