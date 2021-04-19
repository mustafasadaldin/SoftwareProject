package main;

import java.util.*;
import javax.swing.JOptionPane;

public class Book {
     String title;
     String author;
     String signature;
     String isbn;
	 
  boolean isAdded;
	Scanner sc=new Scanner(System.in);
	static Scanner scanner=new Scanner(System.in);
	private List<Book> books=new ArrayList<Book>();
	String read;
	Book[] bk;
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
	


	public   void add(int login, String string, String string2, String string3, String string4) {
		int f;
		Book b= new Book();
		if(login==0) {
			isAdded=false;
		JOptionPane.showMessageDialog(null, "you should be logged in");
	}
		else {
			String s1 =string;
			String s2 =string2;
			String s3=string3;
			while( true) {
				
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
         break;
					
				}
			}
			
				
				
			
			String s4 =string4;
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
			
			b.title=s1;
			b.author=s2;
		
			b.isbn=s4;
			
			
			books.add(b);
			JOptionPane.showMessageDialog(null, "book added succesfully");
			isAdded= true;
		}
		
		
	}
	public void SearchBookTitle(String t) {
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
	
	
	
	public void SearchBookAuthor(String a) {
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
	
	
	public void SearchBookSig(String s) {
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