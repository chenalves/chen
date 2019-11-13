package com.didispace.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceABController {
	@RequestMapping(value="hello")//,method=RequestMethod.POST
	public String hello(@RequestParam("name") String name) {
		return String.format("欢迎%s!我是服务A",name);
	}
}
