package com.book;
import com.book.exception.*;
import com.book.exception.*;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	
	public Book(String bookId,String title,String author,String category,float price){
		try {
			validateCategory(category);
			validatePrice(price);
			validatebookId(bookId);
			}
				catch(Exception e) {
					System.out.println(e);
					System.exit(0);
				
			
			}
			this.bookId=bookId;
			this.title=title;
			this.author=author;
			//this.category=category;
			this.price=price;
		}
		
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId=bookId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void validateCategory(String category) {
		try {
			String sc="Science";
			String fc="Fiction";
			String te="Technology";
			String ot="Others";
			if(category.equals(sc) || category.equals(fc) || category.equals(te) || category.equals(ot) ){
				this.category=category;
				//String msg="Invalid Book Exception";
				//throw  new InvalidBookException(msg);
					
			}
			else{
				String msg="Category either be Science or Fiction or Technology or Others";
				throw  new InvalidBookException(msg);
				}
			}
			catch(InvalidBookException msg) {
				System.out.println(msg);
				System.exit(0);
			}
		
	}
	
	public void validatePrice(float price) {
		try {
			if(price < 0) {
				String msg="Price should not be negative";
				throw new  InvalidBookException(msg);
			}}
			catch(InvalidBookException msg) {
				System.out.println(msg);
				System.exit(0);
			}
	}
	
	public void validatebookId(String bookId) {
		try {
			char ch=bookId.charAt(0);
			int len=bookId.length();
			if((ch!='B') || (len<4)) {
				String msg="BoodId should start with B and length not be less than 4";
				throw new InvalidBookException(msg);
			}}
			catch(InvalidBookException msg) {
				System.out.println(msg);
				System.exit(0);
			}
	}
}
