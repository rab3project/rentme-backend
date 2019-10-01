package com.rent.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.rent" })
@EntityScan(basePackages = { "com.rent.entities" })
public class RentMeMain {

	public static void main(String[] args) {
		SpringApplication.run(RentMeMain.class, args);
	}
}
