package com.example.springcloud.alibaba.consumer.service;

import com.example.springcloud.alibaba.consumer.service.fallback.FallBackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider", fallback = FallBackService.class)
public interface ProviderService {

    //把 provider 项目中的方法拷贝过来即可
    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable("str") String string);
}
