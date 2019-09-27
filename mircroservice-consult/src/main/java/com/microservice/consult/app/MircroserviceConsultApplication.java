package com.microservice.consult.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class MircroserviceConsultApplication {

	public static void main(String[] args) {
		SpringApplication.run(MircroserviceConsultApplication.class, args);
	}

}
