package com.example.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient //注解服务，网关也需注册到注册中心
@EnableZuulProxy //开启zuul网关功能
public class CloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuulApplication.class, args);
    }

}

