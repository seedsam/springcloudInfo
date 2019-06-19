package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HomeError implements HelloWorldService {

	@Override
	public String home() {
		return "eureka-clinet:" + "sorry,error!";
	}

}
