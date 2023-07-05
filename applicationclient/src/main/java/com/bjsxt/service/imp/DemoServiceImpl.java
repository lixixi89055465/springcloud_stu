package com.bjsxt.service.imp;

import com.bjsxt.service.DemoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "myFallback")
    @Override
    public String test() {
        String result = restTemplate.postForObject("http://application-service-demo/demo", null, String.class);
        System.out.println(result);
        return result;
    }

    public String myFallback(){
        return "托底数据";
    }
}
