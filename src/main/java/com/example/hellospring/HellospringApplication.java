package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({MessageProperties.class, MyConfiguration.class})
public class HellospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}
}