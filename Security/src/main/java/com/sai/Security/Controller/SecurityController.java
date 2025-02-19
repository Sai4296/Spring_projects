package com.sai.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "Welcome to security session" + "\n" + request.getRequestedSessionId();
	}
}
