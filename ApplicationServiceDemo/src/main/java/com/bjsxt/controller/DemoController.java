package com.bjsxt.controller;

import com.bjsxt.bean.People;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {
        return "demo-service";
    }


    @RequestMapping("/demo4")
    @ResponseBody
    public List<People> list() {
        List<People> list = new ArrayList<>();
        list.add(new People(1, "张三"));
        list.add(new People(2, "李四"));
        return list;
    }

    @RequestMapping("/demo5")
    @ResponseBody
    public List<People> selectAll() {
        List<People> list = new ArrayList<>();
        list.add(new People(1, "张三"));
        list.add(new People(2, "李四"));
        return list;
    }

//    @RequestMapping("/demo9")
//    @ResponseBody
//    public String demo9(String name) {
//        return "demo9:" + name;
//    }

    @RequestMapping("/demo9")
    @ResponseBody
    public List<String> demo99(@RequestBody List<String> names){
        System.out.println("name:"+names);
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        return list;
    }

}
