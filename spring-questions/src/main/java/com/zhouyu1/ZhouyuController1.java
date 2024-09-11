package com.zhouyu1;

import com.zhouyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： li
 * @date： 2024/9/11 12:20
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
@RestController
public class ZhouyuController1 {
    @Autowired
    private UserService1 userService1;

    @GetMapping("/demo")
    public String tes() {
        return userService1.test();
    }
}
