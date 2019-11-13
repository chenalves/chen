package com.didispace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didispace.service.CustomerService;

@RestController
public class CustomerAController {
	@Autowired
	CustomerService service;
	@RequestMapping("/ribbon-consumer")
	public String costomerA(String name) {
		return service.helloService(name);
	}

}
