package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Home {

	private static Logger log = LoggerFactory.getLogger(Home.class);

	@GetMapping("/")
	public String home() {
		RestTemplate restTemplate = new RestTemplate();
		log.info(null);
		return restTemplate.getForObject("http://localhost:8086/", String.class);
	}

}
