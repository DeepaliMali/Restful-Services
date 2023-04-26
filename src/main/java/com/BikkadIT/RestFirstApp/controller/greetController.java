package com.BikkadIT.RestFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetcontroller")
public class greetController {
	
	@GetMapping("/welcome")
	public String greetmsg()
	{
		return "Welcome to Restful Services First Application";
		
	}
	
	@GetMapping("/greet1")
	public String greet1()
	{
		return "Welcome to Java";

	}

}
