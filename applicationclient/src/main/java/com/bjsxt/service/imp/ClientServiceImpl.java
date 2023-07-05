package com.bjsxt.service.imp;

import com.bjsxt.Bean.People;
import com.bjsxt.service.ClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class ClientServiceImpl implements ClientService {
    //    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    public String myFallback() {
        System.out.println("执行降级 !");
        return "执行降级 !";
    }


    @HystrixCommand(fallbackMethod = "myFallback", commandProperties = {
            // 条件一： 请求数量到达3个
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "3"),
            // 判断时间，没10秒作为一个判断单位
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
            // 条件二: 失败了到达50%
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
            // 结果： 开启熔断后，30秒不在请求远程服务
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "30000")})
    @Override
    public String client() {
        System.out.println("开始请求服务端");
        ServiceInstance si = loadBalancerClient.choose("application-service-demo");
        System.out.println(si.getHost());
        return "client success!";
    }

    @HystrixCollapser(batchMethod = "mybatch", scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL,
            collapserProperties = {
                    @HystrixProperty(name = "timerDelayInMilliseconds", value = "10"),
                    @HystrixProperty(name = "maxRequestsInBatch", value = "200")
            })
    @Override
    public Future<String> demo3(String name) {
        System.out.println("请求合并的方法不会被执行 ");
        ServiceInstance si = loadBalancerClient.choose("application-service-demo");
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(si.getUri() + "/demo9?name={1}", String.class, name);
        return null;
    }

    @HystrixCommand
    public List<String> mybatch(List<String> names) {
        System.out.println("合并后的参数" + names);
        ServiceInstance si = loadBalancerClient.choose("application-service-demo");
        RestTemplate restTemplate = new RestTemplate();
        List list = restTemplate.postForObject(si.getUri() + "/demo9", names, List.class);
        System.out.println("取回来的结果" + list);
        return list;
    }


//    @Override
//    public String client() {
//        return restTemplate.getForObject("http://APPLICATION-SERVICE/demo", String.class);
//    }
}
