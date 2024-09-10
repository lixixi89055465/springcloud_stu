package com.zhouyu;

import com.zhouyu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/10 21:19
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
@ComponentScan("com.zhouyu")
public class AppConfig {
//    @Bean
//    public OrderService orderService1(){
//        return new OrderService();
//    }
    @Bean(autowire = Autowire.BY_TYPE)
    public OrderService orderService(){
        return new OrderService();
    }

}
