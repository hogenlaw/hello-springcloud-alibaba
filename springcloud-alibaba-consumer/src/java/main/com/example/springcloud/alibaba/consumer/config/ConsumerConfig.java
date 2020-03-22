package com.example.springcloud.alibaba.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Configuration 标识这是一个配置类，现在都不用 xml 配置了嘛
 */
@Configuration
public class ConsumerConfig {

    @Bean
    @LoadBalanced //注意要加负载均衡，否则会报错
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
