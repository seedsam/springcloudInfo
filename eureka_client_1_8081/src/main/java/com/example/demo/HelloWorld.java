package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	public String home() {
		return "eureka_client_1_8081";
	}

}
