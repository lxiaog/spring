package com.example.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 未使用断路器
     * @param name
     * @return
     */
    public String hello(String name){
        return restTemplate.getForObject("http://eureka-client/hello?name="+name,String.class);
    }

    /**
     * 使用断路器
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "error") //使用断路器功能
    public String helloHystrix(String name){
        return restTemplate.getForObject("http://eureka-client/hello?name="+name,String.class);
    }
    public String error(String name){
        return "hi,"+name+",sorry,error!";
    }
}
