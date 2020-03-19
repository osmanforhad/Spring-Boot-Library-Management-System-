package com.lms.controllers.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.models.Book;
import com.lms.services.LmsService;

@RestController /**define rest controller annotation*/
public class MainRestController {
	
	@Autowired  /**use Autowired annotation for dependency injection*/
	private LmsService lmsService; /**define Service object*/
 
	@GetMapping(value = "/")/**define which request this method will handle and Mapping the url name*/
	public String hello() {
		
		return "Spring Boot Application using MainRestController";
		
	}//end of the hello method
	
	@GetMapping(value = "/findAllBooks")/**define which request this method will handle and Mapping the url name*/
	public Collection<Book> getAllBooks(){
		return lmsService.findAllBooks(); /**accessing service through the service object and return data*/
	}//end of the getAllBooks method
	
	@GetMapping("/delete")/**define which request this method will handle and Mapping the url name*/
	public void deleteBook(@RequestParam Book id) {
		lmsService.delete(id);
	}//end of the deleteBook method
	
}//end of the MainRestController
