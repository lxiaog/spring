package com.example.cloud.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //注解到注册中心

public class CloudBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBusApplication.class, args);
    }

}

