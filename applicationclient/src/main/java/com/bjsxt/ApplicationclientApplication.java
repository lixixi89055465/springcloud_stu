package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrix
@EnableHystrixDashboard
public class ApplicationclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationclientApplication.class, args);
    }

}
