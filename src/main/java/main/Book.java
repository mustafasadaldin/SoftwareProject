package main;
import java.util.ArrayList;

public class Book {
	String title ;
	String author ;
	String signature;
	String ISBN;
	public ArrayList<Book> books=new ArrayList<Book>();
	public Book() {
		this.title ="Unkown";
		this.signature ="Unkown";
		this.author ="Unkown";
	}
	public Book(String t,String a, String s,String isbn) {
		this.title =t;
		this.signature =s;
		this.author =a;
		this.ISBN=isbn;
	}

	public boolean add(int login,String title, String author, String signature, String ISBN) {
		if(login==0) {
		return false;
	}
		else {
			books.add(new Book(title,author,signature,ISBN));
			return true;
		}
		
		
	}
	

}
