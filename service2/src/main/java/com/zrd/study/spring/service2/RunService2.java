package com.zrd.study.spring.service2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RunService2 {
	@Value("${aa}")
	String msg;
	
	@RequestMapping
	public String hello(){
		return msg;
	}

	public static void main(String[] args) {
		SpringApplication.run(RunService2.class, args);
	}
}
