package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication//注解等价于以默认属性使用 @Configuration ，@EnableAutoConfiguration 和 @ComponentScan
@EnableDiscoveryClient  
@EnableCircuitBreaker //开启断路器功能，进行容错管理
public class ApplicationRibbon {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationRibbon.class).web(true).run(args);
	}
}
