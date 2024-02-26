package com.ci.cd.dhiman.demo.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exampleController {

	
	@GetMapping("status/check")
	public String exampleDemo() {
		
		return "Server is UP";
	}
}
