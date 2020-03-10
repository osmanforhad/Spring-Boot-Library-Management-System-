package com.lms.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lms_tbl") /**mention db table name as a Entity*/
public class Book {
/**
 * Create fields to represent the columns 
 * form the database table
 * */
	@Id /**annoted the id column*/
	@GeneratedValue(strategy = GenerationType.AUTO) /**for auto increment*/
	private long id;
	
	@Column(name = "book_name") /**annoted the column name as like db table*/
	private String bookName;
	
	/**The variable name and the column name is same here
	 * so i don't need to annoted or spacifice
	 * the column name here*/
	private String author;
	
	@Column(name = "purchase_date") /**annoted the column name as like db table*/
	private Date purchaseDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
	
}//end of the class
