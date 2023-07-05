package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@SpringBootApplication
@EnableCircuitBreaker
public class ApplicationclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationclientApplication.class, args);
    }

}
