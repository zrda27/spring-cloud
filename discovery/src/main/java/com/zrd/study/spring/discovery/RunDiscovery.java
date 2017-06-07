package com.zrd.study.spring.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RunDiscovery {

	public static void main(String[] args) {
		SpringApplication.run(RunDiscovery.class, args);
	}
}
