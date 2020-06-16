package com.example.gradelproject.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradelController {
	
	@GetMapping
	public String getData()
	{
		return "Welcome to Gradel Application.";
	}

}
