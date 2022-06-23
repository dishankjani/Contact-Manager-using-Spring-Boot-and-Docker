package com.example.contactapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microserviceapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microserviceapp1Application.class, args);
	}

}

//we created 2nd microservice for contacts and changed the port to 9002  
//just like User service create ContactService, its implementation and controller and entity
//as soon as we type http://localhost:9002/apicontacts/getcon/1 in URI we get all the contacts of user with userid 1
