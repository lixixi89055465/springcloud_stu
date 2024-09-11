package com.zhouyu1;

import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
@Lazy//懒加载
public class UserService1 {
//    @Autowired
//    private UserService1 userService1;

    public String test() {
        return "Zhouyu";
    }
}

