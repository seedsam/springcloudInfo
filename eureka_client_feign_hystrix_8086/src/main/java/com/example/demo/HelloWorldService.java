package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", fallback = HomeError.class)
public interface HelloWorldService {

	@GetMapping("/")
	public String home();

}
