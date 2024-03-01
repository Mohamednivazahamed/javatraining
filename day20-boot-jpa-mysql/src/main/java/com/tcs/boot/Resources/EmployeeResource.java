package com.tcs.boot.Resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

	
	@GetMapping("/")
	public String greet() {
		return "greet() working";
	}
	@GetMapping("/admin")
	public String greetAdmin() {
		return "greet() working for Admin";
	}
	@GetMapping("/user")
	public String greetUser() {
		return "greet() working for User";
	}
	
	
	
}
