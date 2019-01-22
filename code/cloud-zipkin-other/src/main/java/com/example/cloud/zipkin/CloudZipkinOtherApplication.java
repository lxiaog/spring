package com.example.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudZipkinOtherApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZipkinOtherApplication.class, args);
    }

}

