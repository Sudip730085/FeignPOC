package com.example.Service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class Service1Application {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	
	

}
