package com.ust.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/")
	public String getHomePage() {
		return "Dockerizing the Spring Boot Application"; 
	}
    
	@RequestMapping("/docker")
	public String getDockerPage() {
		return "Building and Deploying Application -> Docker"; 
	}


}
