package com.zrd.study.spring.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Service1HystrixService {
	@Autowired
	Service1 service1;
	
	@HystrixCommand(fallbackMethod="fallbackHello")
	public String hello(){
		return service1.hello();
	}
	
	public String fallbackHello(){
		return "service1出故障了";
	}
}
