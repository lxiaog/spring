package com.example.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "eureka-client") //未开启断路器之前
@FeignClient(value = "eureka-client", fallback = FeignServiceImpl.class) //实现断路器功能
public interface FeignService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String helloFeign(@RequestParam(value = "name") String name);
}
