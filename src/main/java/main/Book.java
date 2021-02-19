package main;
import java.util.ArrayList;

public class Book {
	public String title ;
	public	String author ;
	public	String signature;
	public	String ISBN;
	public ArrayList<Book> books=new ArrayList<Book>();
	public Book() {
		this.title ="Unkown";
		this.signature ="Unkown";
		this.author ="Unkown";
		this.ISBN="0";
	}
	

	public boolean add(int login,String title, String author, String signature, String ISBN) {
		if(login==0) {
		return false;
	}
		else {
			Book b= new Book();
			b.title=title;
			b.author=author;
			b.signature=signature;
			b.ISBN=ISBN;
			books.add(b);
			return true;
		}
		
		
	}
	

}
