package main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class User {
public boolean login =false;
public boolean logout =false;
public String username="";
public String password="";
public static ArrayList<User> users=new ArrayList<User>();
Scanner sc=new Scanner(System.in);
public void addUser() {
	System.out.print("new username:");
	String s1=sc.next();
	System.out.print("new password:");
	String s2=sc.next();
	User u =new User();
	u.username=s1;
	u.password=s2;
	
	users.add(u);
	JOptionPane.showMessageDialog(null, "Thanks for signing up");
	
	
}
public void login() {
	System.out.print("username:");
	String s1=sc.next();
	System.out.print("password:");
	String s2=sc.next();
	for(int i=0;i<users.size();i++) {
	if(s1.compareTo(users.get(i).username)==0) {
		if(s2.compareTo(users.get(i).password)==0) {
			login=true;
			logout=false;
			JOptionPane.showMessageDialog(null, "welcome");
			return;
		}
	
		JOptionPane.showMessageDialog(null, "you enter invalid password");
		login=false;
		return;
	}
	}
	JOptionPane.showMessageDialog(null, "you enter invalid username");
	login=false;

	
}

}
