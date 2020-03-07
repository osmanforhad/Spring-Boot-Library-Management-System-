package com.lms.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /**define rest controller annotation*/
public class MainRestController {

	@GetMapping(value = "/")/**define which request this method will handle*/
	public String hello() {
		
		return "Spring Boot Application using MainRestController";
		
	}//end of the hello method
	
}//end of the MainRestController
