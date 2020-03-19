package com.lms.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.LmsRepository;
import com.lms.models.Book;

@Service /**annoted this class as service*/
public class LmsService {
	
	/**
	 * create object of repository for 
	 * access the data from dao
	 * */
	@Autowired /**use Autowired annotation for dependency injection*/
	private LmsRepository lmsRepository;
	
	/**
	 * Create  method findAllBooks for 
	 * return collection
	 * */
	public Collection<Book> findAllBooks(){
		
		/**create a List name
		 * as books
		 * */
		List<Book> books = new ArrayList<Book>(); /**here Book is my created model*/
		
		/**write a for loop*/
		for(Book book : lmsRepository.findAll()) {
			books.add(book); //add collection list
		}//end of the for loop
		
		return books;
		
	}//end of the findAllBooks method
	
	/**method for delete the book*/
	public void delete(Book id) {
		lmsRepository.delete(id);
	}//end of the delete method

}//end of the service class
