package com.example.JenkinsDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
	
	@GetMapping("/msg")
	public String getMsg()
	{
		return "Hello from Spring Boot";
	}

}