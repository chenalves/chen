package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//该注解会根据配置文件中的地址，将服务自身注册到服务注册中心
public class ApplicationSC {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ApplicationSC.class).web(true).run(args);
	}
}
