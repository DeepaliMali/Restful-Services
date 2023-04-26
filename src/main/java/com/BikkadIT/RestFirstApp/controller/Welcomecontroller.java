package com.BikkadIT.RestFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomecontroller")
public class Welcomecontroller {
	
	@GetMapping("/welcome")
	public String welcomemsg()
	{
		return "Welcome to Restful Services";
		
	}

}
