package com.zhouyu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
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
//@Component
//@Aspect
public class ZhouyuAspect {
    public void zhouyuBefore(JoinPoint joinPoint) {
        System.out.println("zhouyuBefore");
    }
}
