package com.example.springcloud.alibaba.consumer.service.fallback;

import com.example.springcloud.alibaba.consumer.service.ProviderService;
import org.springframework.stereotype.Component;

@Component
public class FallBackService implements ProviderService {

    @Override
    public String echo(String string) {
        return "您的网络有问题呢亲！";
    }
}
