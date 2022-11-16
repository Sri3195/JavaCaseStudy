package com.book;
import com.bookutil.*;
import java.util.*;



public class BookStore {
	
	ArrayList<Book> booklist=new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	
	public void addBook(Book b) {
		booklist.add(b);
	}
	
	public void modifyBook(String id) {
		Iterator itr=booklist.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id1=st.getBookId();
			if(id1.equals(id)) {
				System.out.println("Enter the field to modify in small letters");
				String field=sc.nextLine();
				switch(field) {
				case "id":
					System.out.println("Enter the modified id");
					String modid=sc.nextLine();
					st.setBookId(modid);
					break;
				case "title":
					System.out.println("Enter the modified title");
					String modtitle=sc.nextLine();
					st.setTitle(modtitle);
					break;
				case "author":
					System.out.println("Enter the modified author");
					String modauthor=sc.nextLine();
					st.setAuthor(modauthor);
					break;
				case "category":
					System.out.println("Enter the modified category");
					String modcategory=sc.nextLine();
					st.setCategory(modcategory);
					break;
				case "price":
					System.out.println("Enter the modified price");
					float modprice=sc.nextFloat();
					st.setPrice(modprice);
					break;
				}
				
				
			}
		}
	}
	
	public void deleteBook(String id) {
		Iterator itr=booklist.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id1=st.getBookId();
			if(id1.equals(id)) {
				itr.remove();
			}
		}
		
	}
	
	public void displayAll() {
		Iterator itr=booklist.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id=st.getBookId();
			String title=st.getTitle();
			String author=st.getAuthor();
			String category=st.getCategory();
			float price=st.getPrice();
			System.out.println("BoodkId: "+id+"\tTitle: "+title+"\t"+ "Author: "+author + "\tCategory: " + category + "\tPrice: " +price);
		}
		
	}
	
	public void displaySpecific(String id) {
		Iterator itr=booklist.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id1=st.getBookId();
			String title1=st.getTitle();
			String author1=st.getAuthor();
			String category1=st.getCategory();
			float price1=st.getPrice();
			if(id1.equals(id)) {
				System.out.println("BoodkId: "+id1+"\tTitle: "+title1+"\t"+ "Author: "+author1 + "\tCategory: " + category1 + "\tPrice: " +price1);

			}
		}
		
	}

	public void searchbyTitle(String title) {
		Iterator itr=booklist.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id1=st.getBookId();
			String title1=st.getTitle();
			String author1=st.getAuthor();
			String category1=st.getCategory();
			float price1=st.getPrice();
			if(title1.equals(title)) {
				System.out.println("BoodkId: "+id1+"\tTitle: "+title1+"\t"+ "Author: "+author1 + "\tCategory: " + category1 + "\tPrice: " +price1);

			}
		}
		
	}
	
	public void searchbyAuthor(String author) {
		Iterator itr=booklist.iterator();
		while(itr.hasNext()) {
			Book st=(Book)itr.next();
			String id1=st.getBookId();
			String title1=st.getTitle();
			String author1=st.getAuthor();
			String category1=st.getCategory();
			float price1=st.getPrice();
			if(author1.equals(author)) {
				System.out.println("BoodkId: "+id1+"\tTitle: "+title1+"\t"+ "Author: "+author1 + "\tCategory: " + category1 + "\tPrice: " +price1);

			}
		}
			
		
	}
}
