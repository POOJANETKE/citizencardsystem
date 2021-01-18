package com.citizen.userlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.citizen.userlogin")
public class CitizenCardSystemApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CitizenCardSystemApplication.class, args);
	}

}
