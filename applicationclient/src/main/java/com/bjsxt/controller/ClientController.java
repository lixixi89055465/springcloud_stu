package com.bjsxt.controller;

import com.bjsxt.service.ClientService;
import com.bjsxt.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/client")
    public String client() {
        return clientService.client();
    }

    @RequestMapping("/client2")
    @ResponseBody
    public String client(String name) {
        try {
            Future<String> result1 = clientService.demo3("张三");
            Future<String> result2 = clientService.demo3("李四");
            System.out.println(result1.get());
            System.out.println(result2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return "OK";
    }

    @RequestMapping("/thread")
    public String thread() {
        clientService.thread1();
        clientService.thread2();
        return "OK";
    }

    @RequestMapping("/sem")
    public String semaphore() {
        clientService.semaphore();
        return "semaphore :OK";
    }
}
