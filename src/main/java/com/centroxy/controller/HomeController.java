package com.centroxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/admin")
	public String showPageAdmin(Model model) {
		
		return "admin_dashboard";
	}
	
	@GetMapping("/user")
	public String showUserPage() {
		
	// A Test comment added by sudeep to test Tortoise Git
		return "user_dashboard";
	}

}
