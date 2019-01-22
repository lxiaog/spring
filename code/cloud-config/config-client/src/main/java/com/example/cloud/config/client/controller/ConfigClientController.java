package com.example.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/config/client/hello")
    public String configClientHello(){
        return port;
    }

}
