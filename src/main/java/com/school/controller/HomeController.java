package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/showLoginPage")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/showHomePage")
	public String showHomePage() {
		return "index";
	}
	
}
