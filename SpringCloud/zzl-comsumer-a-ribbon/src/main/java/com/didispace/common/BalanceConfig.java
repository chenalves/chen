package com.didispace.common;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class BalanceConfig {
	@LoadBalanced //开启负载均衡客户端  
    @Bean //注册一个具有容错功能的RestTemplate  
    RestTemplate restTemplate() {  
        return new RestTemplate();  
    }  
}
