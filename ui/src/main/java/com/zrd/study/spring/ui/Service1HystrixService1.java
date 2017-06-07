package com.zrd.study.spring.ui;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class Service1HystrixService1 {
	RestTemplate restTemplate = new RestTemplate();
	
	@HystrixCommand(fallbackMethod="fallbackHello")
	public String hello(){
		return restTemplate.getForObject("http://service1/hello", String.class);
	}
	
	public String fallbackHello(){
		return "service1出故障了";
	}
}
