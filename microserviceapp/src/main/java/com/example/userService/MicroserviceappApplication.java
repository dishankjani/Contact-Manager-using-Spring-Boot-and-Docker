package com.example.userService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceappApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}

}

//we will be developing a contact menager application

/**
 * steps to create:
 * 
 * change the port number to 9001
 * create User and Contact entity
 * create the user service and its implementation to get the user using userid
 * create controller for getting a user using his userid
 * create another microservice(i.e. create one more spring starter app for contacts), go to microservice-1 project
 * 
 * now both microservice are up and running but we need to connect them which is done RestTemplate
 * for that we need to create a bean of resttemplate in main class so that we can autowire it anywhere
 * next, in the controller we use the Resttemplate object and getmapping URI of contacts microservice to get the list of contacts from Contacts service
 * 
 * now our both services are connected but we dont want hardcore uRI as localhost, thus we crete a eureka server
 * create a new project i.e. 3rd microservice for eureka server and add eureka server as the dependency and go to that project
 * once eureka server is created we cannot see any applications in eureka server page, thus we have to add contact and user as eureka client.
 * so go to contact service and user service, and add dependecies for eureka client and add @enableeurekaclient annoation on main class
 * then we also have to change the application name and instance hostname in application.properties file for both the applications
 * then go to user application add @loadbalanced on top of resttemplate bean and chnage the uri from localhost:9002 to contact-service in resttemplate implimentation 
 * 
 * 
 * 
 * next we have to implement APi gateway. we have to type uri/contact for accessing contact service and uri/user for accessing user's service. End User dont want to call each service sepratly.
 *  their request should go to API gateway and then it should forward the request to required se4rvice
 *  create a APi gateway application with 3 dependeicnes eureka client, actuator and gateway
 *  then go to api gateway application.
 *  
 *  once our complete microservices are developed we will now deploy it on containers.
 *  create the jar file using maven build
 *  create a docker file in each application inside root folder and build it using the command 'docker build'
 *  thus now we will have 3 images for each eureka client and run that so that we will have 3 conmtainers running
 *  as this containers are isolated from each other we need docker compose using which we will get all the images and run them together using a single yaml file
 *  
 * 
 * 
 */
