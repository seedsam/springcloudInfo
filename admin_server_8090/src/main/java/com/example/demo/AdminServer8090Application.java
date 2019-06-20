package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServer8090Application {

	public static void main(String[] args) {
		SpringApplication.run(AdminServer8090Application.class, args);
	}

}
