package com.zhouyu.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/10 21:19
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
@Component
public class UserService implements InitializingBean {
//    @Autowired
    private OrderService orderService;

//    public UserService() {
//        System.out.println(0);
//    }

    @Autowired
    public UserService(OrderService orderService1) {
        this.orderService = orderService1;
        System.out.println(1);
    }
    public UserService(OrderService orderService,OrderService orderService1) {
        this.orderService = orderService1;
        System.out.println(2);
        System.out.println(orderService == orderService1);
        System.out.println(orderService);
        System.out.println(1);
        System.out.println(orderService1);
        System.out.println(0);
    }

    public void test(){
        System.out.println(orderService);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet\t"+orderService);
    }
}
