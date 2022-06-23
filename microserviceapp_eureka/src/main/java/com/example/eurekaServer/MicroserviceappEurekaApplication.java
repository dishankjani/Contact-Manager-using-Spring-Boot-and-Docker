package com.example.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceappEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceappEurekaApplication.class, args);
	}

}

//first add enableeurekaserver in main class
//then create a yaml based configuration file and mention sureka server configuration and port number in application.properties
//next go to user and contacts service and add eureka client in it's pom.xml file. we add 3 things 1)spring cloid version,2) eurekaclient dependency and 3) dependency management file
//just run both the services now we can find it in the eureka server.
//next add application name and instance hostname in application.properties in both user and contact microservice
//now in the userservice in the url part of resttemplate instead of localhost:9002 we can use contact-service. and we also need to add loadbalanced annotation below bean in resttemplate
//thus now our microservice is registered with eureka server and now we implement API gateway

