package com.lms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller /**mention annotation the class works as a controller*/
public class MainController {
	
	@GetMapping("/hellojsp")/**Mapping the url name*/
	public String init() {
		return "index";/**return targated page*/
	}//end of the init method

}//end of the MainController class
