package com.example.cloud.zipkin.config;

import brave.sampler.Sampler;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Sampler sampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}
