package com.wipro.springsecurityapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserLogin {

	@GetMapping
	String user() {
		return "Hi User";
	}
}
