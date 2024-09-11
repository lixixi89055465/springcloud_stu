package com.zhouyu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/10 21:17
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
@Aspect
@Component
@Configuration
public class ZhouyuAspect {
    @Before("execution(public void com.zhouyu.service.UserService.test())")
    public void zhouyuBefore(JoinPoint joinPoint) {
        System.out.println("zhouyuBefore");
    }
}
