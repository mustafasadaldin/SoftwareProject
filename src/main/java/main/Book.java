package main;

import java.util.*;
import javax.swing.JOptionPane;

public class Book {
   private  String title;
   private   String author;
   private  String signature;
   private  String isbn;
   private static final String TITLE_STR="title:";
   private static final String AUTHOR_STR="author:";
   private static final String SIGNATURE_STR="signature:";
   private static final String ISBN_STRL="ISBN:";
   private static final String STARS="***************************";
   private static final String BOOK_NOT_HERE="the book you search for it is not here";
	 
  private boolean isAdded;
	
	static Scanner scanner=new Scanner(System.in);
	private List<Book> books=new ArrayList<>();
	String read;
	Book[] bk;
private int j;
	public Book() {
		title="";
		author="";
		signature="";
		isbn="";
	}
	public void setTitle(String t) {
		this.title=t;
	}
	public String getTitle() {
		return this.title;
	}
	public void setSignature(String s) {
		this.signature=s;
	}
	public String getSignature() {
		return this.signature;
		
	}
	public void setIsbn(String i) {
		this.isbn=i;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public void setAuthor(String a) {
		this.author=a;
	}
	public  void setB() {
		books.add(new Book());

	}
	public Book getB(int i) {

		return books.get(i);

	}
	public String getAuthor() {
		return this.author;
	}
	public boolean isAdded() {
		return this.isAdded;
	}
	public void setIsAdded(boolean bool) {
		this.isAdded=bool;
	}
	public boolean getIsAdded() {
	return	this.isAdded;
	}
	public int getJ() {
		return	this.j;
		}


	public   void add(int login, String string, String string2, String string3, String string4) {
		
		Book b= new Book();
		if(login==0) {
			isAdded=false;
		JOptionPane.showMessageDialog(null, "you should be logged in");
	}
		else {
			String s1 =string;
			String s2 =string2;
			String s3=string3;
			boolean brk=true;
			checkSignature(b, s3, brk);
			
				
				
			
			String s4 =string4;
			
			boolean brk0=true;
			s4 = checkingIsbn(s4, brk0);
			
			b.title=s1;
			b.author=s2;
		
			b.isbn=s4;
			
			
			books.add(b);
			JOptionPane.showMessageDialog(null, "book added succesfully");
			isAdded= true;
		}
		
		
	}
	private void checkSignature(Book b, String s3, boolean brk) {
		int f;
		while( brk) {
			
			f=1;
			 
			for(Book k: books) {
				
				if(k.signature.equals(s3)) {
				
				f=0;
				
			}}
			
			if(f==1) {
				b.signature=s3;
			break;
			}
			else {
				JOptionPane.showMessageDialog(null, "invalid signature");
       brk=false;
				
			}
		}
	}
	private String checkingIsbn(String s4, boolean brk0) {
		char[] ss;
		boolean cont;
		while(brk0) {
			cont=true;
			int flagg=0;
			ss=s4.toCharArray();
			if(ss.length==10) {
				flagg = checkIsbn(ss, flagg);
				if(flagg==0) {
					int z=10;
					int sum=0;
					sum = sumOfIsbn(ss, z, sum);
					if(sum%11==0) {
						cont=false;
						brk0=false;
						
					}
					
					else {
						JOptionPane.showMessageDialog(null, "please enter valid isbn");							
						s4 =scanner.next();
						cont=false;
					}
				}
			}
			s4 = ifNotNum(s4, cont);
			
		}
		return s4;
	}
	private int checkIsbn(char[] ss, int flagg) {
		for(int i=0;i<10;i++) {
			if(!(ss[i]>='0'&&ss[i]<='9')) {
				
			
				flagg=1;
				break;
			
			}
		}
		return flagg;
	}
	private int sumOfIsbn(char[] ss, int z, int sum) {
		for(int i=0;i<ss.length;i++) {
			sum=sum+(z*Integer.parseInt(ss[i]+""));
			z--;
		}
		return sum;
	}
	private String ifNotNum(String s4, boolean cont) {
		if(cont) {
		JOptionPane.showMessageDialog(null, "please enter valid isbn");				
		s4 =scanner.next();
		}
		return s4;
	}
	
	public void searchBookTitle(String t) {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		read=t;
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).title.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		computeT();
	}
	private void computeT() {
		if(j!=0) {
			StringBuilder temps=new StringBuilder("The books that have that title are:"+"\n");
			for(int k=0;k<j;k++) {
			temps.append(TITLE_STR+bk[k].title+"\n"+AUTHOR_STR+bk[k].author+"\n"
			+SIGNATURE_STR+bk[k].signature+'\n'+ISBN_STRL+bk[k].isbn+"\n"
			+STARS+"\n");
						
						
			}
			
		JOptionPane.showMessageDialog(null, temps);
			return;
		}
		JOptionPane.showMessageDialog(null, BOOK_NOT_HERE);
	}
	
	
	
	public void searchBookAuthor(String a) {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		read=a;
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).author.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		computeT();
	}
	
	
	public void searchBookSig(String s) {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		read=s;
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).signature.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		computeT();
	}
	
	
	public void searchBookISBN(String isb) {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		read=isb;
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).isbn.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		computeT();
	}
	

}