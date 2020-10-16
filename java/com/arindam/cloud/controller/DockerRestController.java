package com.arindam.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {
	
	

	
	@GetMapping("/test-docker")
	public String getData()
	{
		 return "return docker test1";
	}

}
