package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/demo")
public class RestController {
	
	
	@GetMapping
	public String name() {
		return "Welcome Gandu";
		
	}

}
