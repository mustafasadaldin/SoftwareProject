package main;

import java.util.*;
import javax.swing.JOptionPane;

public class Book {
     String title;
	 String author;
	 String signature;
     String isbn;
	public static  boolean isAdded;
	Scanner sc=new Scanner(System.in);
	static Scanner scanner=new Scanner(System.in);
	public static ArrayList<Book> books=new ArrayList<Book>();
	String read;
	Book bk[];
public int j;
	public Book() {
		
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
	public String getAuthor() {
		return this.author;
	}
	


	public static  void add(int login) {
		int f;
		if(login==0) {
			isAdded= false;
		JOptionPane.showMessageDialog(null, "you should be logged in");
	}
		else {
			System.out.println("please enter the book title :  ");
			String s1 =scanner.next();
			System.out.println("please enter the book author :  ");
			String s2 =scanner.next();
			String s3="" ;
			while( true) {
				System.out.println("please  enter a unique book signature:  ");
				f=1;
				 s3 =scanner.next();
				for(Book k: books) {
					if(!k.signature.equals(s3)) {
					
					continue;
					}
					
					f=0;
					
				}
				
				if(f==1) {
				
				break;
				}
			}
				
				
			
			System.out.println("please enter the book ISBN :  ");
			String s4 =scanner.next();
			char[] ss;
			while(true) {
				int flagg=0;
				ss=s4.toCharArray();
				if(ss.length==10) {
					for(int i=0;i<10;i++) {
						if(ss[i]>='0'&&ss[i]<='9')
							continue;
						else {
							flagg=1;
							break;
						}
							
					}
					if(flagg==0) {
						int z=10;
						int sum=0;
						for(int i=0;i<ss.length;i++) {
							sum=sum+(z*Integer.parseInt(ss[i]+""));
							z--;
						}
						if(sum%11==0)
						break;
						else {
							JOptionPane.showMessageDialog(null, "please enter valid isbn");
							System.out.println(" reenter the book ISBN :  ");
							s4 =scanner.next();
							continue;
						}
					}
				}
				JOptionPane.showMessageDialog(null, "please enter valid isbn");
				System.out.println(" reenter the book ISBN :  ");
				s4 =scanner.next();
				
			}
			Book b= new Book();
			b.title=s1;
			b.author=s2;
			b.signature=s3;
			b.isbn=s4;
			
			
			books.add(b);
			JOptionPane.showMessageDialog(null, "book added succesfully");
			isAdded= true;
		}
		
		
	}
	public void SearchBookTitle() {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		System.out.print("enter book title please:");
		read=sc.next();
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).title.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		if(j!=0) {
			String temps="The books that have that title are:"+"\n";
			for(int k=0;k<j;k++) {
			temps+="title: "+bk[k].title+"\n"+"author: "+bk[k].author+"\n"
			+"signature: "+bk[k].signature+'\n'+"ISBN: "+bk[k].isbn+"\n"
			+"***************************"+"\n";
						
						
			}
			
		JOptionPane.showMessageDialog(null, temps);
			return;
		}
		JOptionPane.showMessageDialog(null, "the book you search for it is not here");
	}
	
	
	
	public void SearchBookAuthor() {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		System.out.print("enter book author name please:");
		read=sc.next();
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).author.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		if(j!=0) {
			String temps="The books that have that author name are:"+"\n";
			for(int k=0;k<j;k++) {
			temps+="title: "+bk[k].title+"\n"+"author: "+bk[k].author+"\n"
			+"signature: "+bk[k].signature+'\n'+"ISBN: "+bk[k].isbn+"\n"
			+"***************************"+"\n";
						
						
			}
			
		JOptionPane.showMessageDialog(null, temps);
			return;
		}
		JOptionPane.showMessageDialog(null, "the book you search for it is not here");
	}
	
	
	public void SearchBookSig() {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		System.out.print("enter book signeture please:");
		read=sc.next();
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).signature.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		if(j!=0) {
			String temps="The books that have that signeture are:"+"\n";
			for(int k=0;k<j;k++) {
			temps+="title: "+bk[k].title+"\n"+"author: "+bk[k].author+"\n"
			+"signature: "+bk[k].signature+'\n'+"ISBN: "+bk[k].isbn+"\n"
			+"***************************"+"\n";
						
						
			}
			
		JOptionPane.showMessageDialog(null, temps);
			return;
		}
		JOptionPane.showMessageDialog(null, "the book you search for it is not here");
	}
	
	
	public void SearchBookISBN() {
		 j=0;
		bk=new Book[books.size()];
		int temp;
		System.out.print("enter book ISBN please:");
		read=sc.next();
		for(int i=0;i<books.size();i++) {
			temp=books.get(i).isbn.indexOf(read);
			if(temp!=-1) {
				bk[j]=books.get(i);
				j++;
			}
		}
		if(j!=0) {
			String temps="The books that have that ISBN are:"+"\n";
			for(int k=0;k<j;k++) {
			temps+="title: "+bk[k].title+"\n"+"author: "+bk[k].author+"\n"
			+"signature: "+bk[k].signature+'\n'+"ISBN: "+bk[k].isbn+"\n"
			+"***************************"+"\n";
						
						
			}
			
		JOptionPane.showMessageDialog(null, temps);
			return;
		}
		JOptionPane.showMessageDialog(null, "the book you search for it is not here");
	}
	

}