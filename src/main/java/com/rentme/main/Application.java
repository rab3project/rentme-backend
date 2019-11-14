package com.rentme.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.rentme" })
@EntityScan(basePackages = { "com.rentme.entities" })
@EnableJpaRepositories(basePackages = { "com.rentme.repositories" })
public class Application {
	public static void main(String[] Args) {
		SpringApplication.run(Application.class, Args);
	}
}
