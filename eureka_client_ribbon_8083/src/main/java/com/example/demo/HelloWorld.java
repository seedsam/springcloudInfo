package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorld {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	public String home() {
		return restTemplate.getForObject("http://eureka-client/", String.class);
	}

}
