package com.sai.Security2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String greet() {
		return "Welcome to OAuth2";
	}
}
