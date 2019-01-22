package com.example.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient //注册服务
@EnableHystrix //开启断路器功能
public class CloudRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonApplication.class, args);
    }

}

