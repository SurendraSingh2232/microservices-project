package com.ServiceA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAApplication {

	private final Logger log = LoggerFactory.getLogger(ServiceAApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
}
