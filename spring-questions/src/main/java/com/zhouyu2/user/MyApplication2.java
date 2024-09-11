package com.zhouyu2.user;

import com.zhouyu2.springframework.ZhouyuApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/11 12:12
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class MyApplication2 {
    public static void main(String[] args) {
        ZhouyuApplicationContext applicationContext = new ZhouyuApplicationContext(AppConfig2.class);
        UserService2 userService2 = (UserService2) applicationContext.getBean("userService");
        userService2.test();

    }
}
