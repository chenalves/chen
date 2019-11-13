package com.didispace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.didispace.service.impl.CustomerServiceImpl;
//用于通知Feign组件对该接口进行代理(不需要编写接口实现)， SERVICE-AB代理的具体服务
@FeignClient(value="SERVICE-AB",decode404=false,fallback=CustomerServiceImpl.class)
public interface CustomerService {
	@RequestMapping(value="hello",method=RequestMethod.POST)
	/**
	 * @RequestParam("name")这个参数里的name不能省略，如果少掉，虽然不会报错，但入参无法注入。
	 * @param name
	 * @return
	 */
   public String helloService(@RequestParam("name")String name);
}
