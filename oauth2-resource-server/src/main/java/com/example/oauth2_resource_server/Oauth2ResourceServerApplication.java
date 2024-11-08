package com.example.oauth2_resource_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
		(exclude = { SecurityAutoConfiguration.class})

public class Oauth2ResourceServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(Oauth2ResourceServerApplication.class, args);
	}

}
