package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	public String title ;
	public String author ;
	public String signature;
	public String ISBN;
	Scanner scanner=new Scanner(System.in);
	public ArrayList<Book> books=new ArrayList<Book>();
	public Book() {
		this.title ="Unkown";
		this.signature ="Unkown";
		this.author ="Unkown";
		this.ISBN="0";
	}
	

	public boolean add(int login) {
		if(login==0) {
		return false;
	}
		else {
			System.out.println("please enter the book title :  ");
			String s1 =scanner.next();
			System.out.println("please enter the book author :  ");
			String s2 =scanner.next();
			System.out.println("please enter the book signature:  ");
			String s3 =scanner.next();
			System.out.println("please enter the book ISBN :  ");
			String s4 =scanner.next();
			Book b= new Book();
			b.title=s1;
			b.author=s2;
			b.signature=s3;
			b.ISBN=s4;
			
			
			books.add(b);
			return true;
		}
		
		
	}
	

}
