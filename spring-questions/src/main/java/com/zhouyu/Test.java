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
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.test();
    }

}
