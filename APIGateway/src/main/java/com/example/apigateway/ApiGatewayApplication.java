package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}

/*
 *add eureka client annotation on main class and assign port number, instance host name and pplication name in properties file
 *next, we have to specify routes i.e. on which request what application will be called so define it in application.yml file 
 */
