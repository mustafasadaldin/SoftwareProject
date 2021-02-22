package main;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Book {
	public String title ;
	public String author ;
	public String signature;
	public String ISBN;
	public boolean isAdded;
	Scanner scanner=new Scanner(System.in);
	public ArrayList<Book> books=new ArrayList<Book>();
	public Book() {
		this.title ="Unkown";
		this.signature ="Unkown";
		this.author ="Unkown";
		this.ISBN="0";
	}
	

	public void add(int login) {
		boolean uniqueSi=false;
		if(login==0) {
			JOptionPane.showMessageDialog(null, "you must login to add a book ");
			this.isAdded=false;
		
	}
		else {
			System.out.println("please enter the book title :  ");
			String s1 =scanner.next();
			System.out.println("please enter the book author :  ");
			String s2 =scanner.next();
			String s3="" ;
			while( !uniqueSi) {
				System.out.println("please  enter a unique book signature:  ");
				 s3 =scanner.next();
				for(Book k: books) {
					if(k.signature.equals(s3)) {uniqueSi=false ;
					continue;
					}
				}
				uniqueSi=true;
			}
			
			System.out.println("please enter the book ISBN :  ");
			String s4 =scanner.next();
			
			Book b= new Book();
			b.title=s1;
			b.author=s2;
			b.signature=s3;
			b.ISBN=s4;
			
			
			books.add(b);
			JOptionPane.showMessageDialog(null, "Book added successfully ");
			this.isAdded=true;
			
		}
		
		
	}
	

}
