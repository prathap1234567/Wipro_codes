package com.wipro.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/greeting")
	String greet() {
		return "Greeting from Spring Boot!!";
	}
}
