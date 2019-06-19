package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorld {

	@Autowired
	RestTemplate restTemplate;

	public String home() {
		return restTemplate.getForObject("http://eureka_client_1_8081/", String.class);
	}

}
