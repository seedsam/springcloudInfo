package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloWorld {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	@HystrixCommand(fallbackMethod = "homeError")
	public String home() {
		return restTemplate.getForObject("http://eureka-client/", String.class);
	}

	public String homeError() {
		return "eureka-client:" + "sorry,error!";
	}

}
