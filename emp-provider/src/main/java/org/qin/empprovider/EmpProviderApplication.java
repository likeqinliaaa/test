package org.qin.empprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("org.qin.empprovider.mapper")
public class EmpProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpProviderApplication.class, args);
    }

}
