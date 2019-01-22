package com.example.cloud.feign.conteoller;

import com.example.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/feign")
    public String helloFeign(String name) {
        return feignService.helloFeign(name);
    }
}
