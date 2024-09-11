package com.zhouyu.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/10 21:19
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
//@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true) //开启代理暴露
@Component
public class UserService implements InitializingBean {
    @Autowired
    private OrderService orderService;
    @Autowired
    private User admin;

    public void test(){
        System.out.println(admin);
    }
    @PostConstruct
    public void a(){

    }

//    public UserService() {
//        System.out.println(0);
//    }

//    @Autowired
//    public UserService(OrderService orderService1) {
//        this.orderService = orderService1;
//        System.out.println(1);
//    }
//    public UserService(OrderService orderService,OrderService orderService1) {
//        this.orderService = orderService1;
//        System.out.println(2);
//        System.out.println(orderService == orderService1);
//        System.out.println(orderService);
//        System.out.println(1);
//        System.out.println(orderService1);
//        System.out.println(0);
//    }

//    public void test(){
//        System.out.println(3);
//        System.out.println(orderService);
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet\t" + orderService);
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService userService;
//
//    @Transactional
//    public void test() {
//        jdbcTemplate.execute("INSERT INTO t1(col1) VALUES('c')");
//        userService.a();
//    }

//    @Transactional(propagation = Propagation.NEVER)
//    public void a() {
//        jdbcTemplate.execute("INSERT INTO t1(col1) VALUES('f')");
//    }
}
