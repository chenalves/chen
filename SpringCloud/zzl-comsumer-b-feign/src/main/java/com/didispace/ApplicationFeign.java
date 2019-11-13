package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication//注解等价于以默认属性使用 @Configuration ，@EnableAutoConfiguration 和 @ComponentScan
@EnableDiscoveryClient
@EnableEurekaClient//这个配置加上。
@EnableFeignClients //开启spring cloud feign的支持
public class ApplicationFeign {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationFeign.class).web(true).run(args);
	}
}
