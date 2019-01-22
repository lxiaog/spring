package com.example.cloud.ribbon.controller;

import com.example.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbon")
    public String ribbonHello(String name){
        return helloService.hello(name);
    }

    @RequestMapping(value = "/hystrix")
    public String helloHystrix(String name){
        return helloService.helloHystrix(name);
    }

}
