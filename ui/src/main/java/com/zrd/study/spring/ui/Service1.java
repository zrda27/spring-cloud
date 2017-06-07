package com.zrd.study.spring.ui;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service1")
public interface Service1 {
	@RequestMapping("/hello")
	String hello();
}
