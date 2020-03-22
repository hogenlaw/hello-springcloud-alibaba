package com.example.springcloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProviderController {

    @Value("${server.port}")
    private String port;

    //http://localhost:8070/echo/hok 先测试一下，实际开发是用消费者来调用服务方
    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable("str") String string){
        return "Hello Nacos Provider "+port+" 端口返回："+string;
    }
}
