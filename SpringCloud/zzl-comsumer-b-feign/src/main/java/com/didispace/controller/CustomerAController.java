package com.didispace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.didispace.service.CustomerService;

@RestController
public class CustomerAController {
	@Autowired
	CustomerService service;
	@RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
	public String costomerA(@RequestParam("name")String name) {
		return service.helloService(name);
	}

}
