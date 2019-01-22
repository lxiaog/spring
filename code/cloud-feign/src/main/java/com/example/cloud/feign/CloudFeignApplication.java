package com.example.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //开启Feign的功能
@EnableEurekaClient //使用Eureka注册服务
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }

}

