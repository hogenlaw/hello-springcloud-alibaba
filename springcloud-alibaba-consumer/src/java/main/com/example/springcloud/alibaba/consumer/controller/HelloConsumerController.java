package com.example.springcloud.alibaba.consumer.controller;

import com.example.springcloud.alibaba.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class HelloConsumerController {
    @Value("${user.name}")
    private String username;
    @Resource
    private ProviderService providerService;
    //openfeign 方式请求
    @GetMapping(value="/feign/echo")
    public String feignEcho(){
        return providerService.echo(username);
    }

//    //http://localhost:8080/actuator/nacos-discovery
//
//    //final 这里可以保证线程安全
//    @Resource
//    private RestTemplate restTemplate;
//
//    //rest 方式请求
//    //弊端：getForObject()里面还是要写服务的名字，不是很友好
//    @GetMapping(value="/rest/echo/{str}")
//    public String restEcho(@PathVariable("str") String string){
//        return restTemplate.getForObject("http://service-provider/echo/"+string, String.class);
//    }
//
//    @Resource
//    private ProviderService providerService;
//    //openfeign 方式请求
//    @GetMapping(value="/feign/echo/{str}")
//    public String feignEcho(@PathVariable("str") String string){
//        return providerService.echo(string);
//    }
}
