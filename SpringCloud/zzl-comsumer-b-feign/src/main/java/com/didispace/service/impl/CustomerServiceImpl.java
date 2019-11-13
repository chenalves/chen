package com.didispace.service.impl;

import org.springframework.stereotype.Component;

import com.didispace.service.CustomerService;
@Component//该配置容易丢。
public class CustomerServiceImpl implements CustomerService{
	@Override
	public String helloService(String name) {
		return String.format("你好%s,请求出错，请确认再试！", name);
	}
} 
