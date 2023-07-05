package com.bjsxt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demo01() {
        System.out.println("执行了demo");
        return "suiyi";

    }
}
