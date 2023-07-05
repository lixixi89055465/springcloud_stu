package com.bjsxt.config;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getTemplate(){
        return  new RestTemplate();
    }
    @Bean
    public RandomRule getRandomRule(){
        return new RandomRule();
    }

}
