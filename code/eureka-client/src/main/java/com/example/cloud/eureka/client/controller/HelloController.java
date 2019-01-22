package com.example.cloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam(value = "name", defaultValue = "eureka-clien") String name) {
        return "hi " + name + " i am from port:" + port;
    }
}
