package com.example.cloud.feign.service;

import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String helloFeign(String name) {
        return name + " error";
    }
}
