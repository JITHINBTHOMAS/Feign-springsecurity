package com.ust.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecureController {

	
	@GetMapping("/")
	public String greet() {
		return "hello";
	}
	@GetMapping("/admin")
	public String greetAdmin() {
		return "hello Admin";
	}
	@GetMapping("/user")
	public String greetUser() {
		return "hello User";
	}
	
}
