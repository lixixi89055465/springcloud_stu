package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaclusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclusterApplication.class, args);
    }

}
