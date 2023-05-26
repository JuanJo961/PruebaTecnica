package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String register() {
		return "register";
	}
	
	@PostMapping("/registerUser")
	public String registerUser() {
		return "home";
		
	}

}
