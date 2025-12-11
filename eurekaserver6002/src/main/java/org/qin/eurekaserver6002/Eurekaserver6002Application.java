package org.qin.eurekaserver6002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eurekaserver6002Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver6002Application.class, args);
    }

}
