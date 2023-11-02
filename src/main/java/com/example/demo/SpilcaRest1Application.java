package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * We will use 2 tools: Spring Cloud OpenFeign and WebClient(Web Flux)
 * 
 * This app represents the "payment service" which is the REST endpoint
 * 
 * An external API where I collect info
 */



@SpringBootApplication
@ComponentScan(basePackages= {"controllers"})
public class SpilcaRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpilcaRest1Application.class, args);
	}

}
