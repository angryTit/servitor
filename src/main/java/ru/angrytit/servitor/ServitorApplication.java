package ru.angrytit.servitor;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Mikhail Tyamin
 */
@SpringBootApplication
@EnableScheduling
public class ServitorApplication {

    @Bean
    public AWSElasticBeanstalk elasticBeanstalkClient(@Value("${default.aws.region}") String defaultRegion) {
        AWSElasticBeanstalk elasticBeanstalkClient = new AWSElasticBeanstalkClient();
        elasticBeanstalkClient.setRegion(region(defaultRegion));
        return elasticBeanstalkClient;
    }

    @Bean
    public AmazonEC2 amazonEC2Client(@Value("${default.aws.region}") String defaultRegion) {
        AmazonEC2 amazonEC2 = new AmazonEC2Client();
        amazonEC2.setRegion(region(defaultRegion));
        return amazonEC2;
    }

    private Region region(final String defaultRegion) {
        Region region = Regions.getCurrentRegion();
        if (region == null) {
            region = Region.getRegion(Regions.valueOf(defaultRegion));
        }
        return region;
    }

    public static void main(String... args) {
        SpringApplication loadBalancerApp = new SpringApplication(ServitorApplication.class);
        loadBalancerApp.setShowBanner(false);
        loadBalancerApp.run(args);
    }
}
