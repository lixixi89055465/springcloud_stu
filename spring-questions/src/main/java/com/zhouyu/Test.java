package com.zhouyu;

import com.zhouyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/10 21:20
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        Object o = new Object();
//        applicationContext.getBeanFactory().registerSingleton("xxx", o);
        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserService userService1 = (UserService) applicationContext.getBean("userService");
//        UserService userService2 = (UserService) applicationContext.getBean("userService");
        userService.test();
//        userService1.test();
//        userService2.test();
//        Object o1 = applicationContext.getBean("xxx");
//        System.out.println(o1);
    }

}
