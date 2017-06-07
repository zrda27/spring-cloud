package com.zrd.study.spring.service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RunService1 {
	@Value("${aa}")
	String msg;
	
	@RequestMapping
	public String hello(){
		return msg;
	}

	public static void main(String[] args) {
		SpringApplication.run(RunService1.class, args);
	}
}
