/**
 * 
 */
package com.bookutil;
import com.book.*;

import java.util.*;

/**
 * @author HP
 *
 */
public class BookUtil {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		BookStore bs=new BookStore();
		Scanner sc=new Scanner(System.in);
		//System.out.println("1.Add\t2.Modify\t3.Delete\t4.DisplayAll\t5.DisplaySpecific\t6.SearchbyTitle\t7.SearchbyAuthor\t8.Exit");
		int choice=0;
		while(choice!=8) {
			System.out.println("\n1.Add\t2.Modify\t3.Delete\t4.DisplayAll\t5.DisplaySpecific\t6.SearchbyTitle\t7.SearchbyAuthor\t8.Exit");
			choice=sc.nextInt();
			sc.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter BookId");
			String id=sc.nextLine();
			System.out.println("Enter Title");
			String title=sc.nextLine();
			System.out.println("Enter Author");
			String author=sc.nextLine();
			System.out.println("Enter Category");
			String category=sc.nextLine();
			System.out.println("Enter Price of the book");
			float price=sc.nextFloat();
			
			Book b=new Book(id,title,author,category,price);
			bs.addBook(b);
			System.out.println("Book added Successfully !");
			break;
		case 2:
			System.out.println("Enter the book Id to modify");
			String id1=sc.next();
			bs.modifyBook(id1);
			System.out.println("Modified  successfully");
			break;
		case 3:
			System.out.println("Enter the book Id to delete");
			String id2=sc.next();
			bs.deleteBook(id2);
			System.out.println("Book Deleted Successfully");
			break;
		case 4:
			bs.displayAll();
			System.out.println("These are the book details, the End !!");
			break;
		case 5:
			System.out.println("Enter the book Id to display");
			String id3=sc.next();
			bs.displaySpecific(id3);
			System.out.println("Displayed successfully");
			break;
		case 6:
			System.out.println("Enter the book title to search");
			String title1=sc.next();
			bs.searchbyTitle(title1);
			System.out.println("Search completed !");
			break;
		case 7:
			System.out.println("Enter the book author to search");
			String title2=sc.next();
			bs.searchbyAuthor(title2);
			System.out.println("Search completed !");
			break;
		case 8:
			return ;
			
		}}
		
	
}

}
