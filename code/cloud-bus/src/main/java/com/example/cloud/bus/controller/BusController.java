package com.example.cloud.bus.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope //动态刷新
public class BusController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/bus")
    public String hellBus(){
        log.info("消息总线端口号："+port);
        return "端口号："+port;
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo(){
        log.info("消息总线："+foo);
        return "端口号："+foo;
    }
}
