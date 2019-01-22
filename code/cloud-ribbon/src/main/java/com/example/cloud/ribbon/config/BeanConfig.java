package com.example.cloud.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BeanConfig {

    @Bean //将对象注解在IOC容器中
    @LoadBalanced //负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
