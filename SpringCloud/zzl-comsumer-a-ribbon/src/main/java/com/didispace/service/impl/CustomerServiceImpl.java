package com.didispace.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.didispace.service.CustomerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	RestTemplate restTemplate;
	@Override
	//注解指定发生错误时的回调方法  
    @HystrixCommand(fallbackMethod = "helloFallBack") 
	public String helloService(String name) {
		return restTemplate.getForObject("http://SERVICE-AB/hello?name="+name, String.class);
	}
    public String helloFallBack(String name) {
    	return "error request:"+name;
    }
}
