package main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Admin {
Scanner sc=new Scanner(System.in);
public String username="";
public String password="";
public int login;
public int logout=0;
public static ArrayList<Admin> v=new ArrayList<Admin>();



 // Scenario1 login with valid cradentials
	public void login() {
		System.out.print("username:");
		String s1=sc.next();
		System.out.print("password:");
		String s2=sc.next();
		for(int i=0;i<v.size();i++) {
		if(s1.compareTo(v.get(i).username)==0) {
			if(s2.compareTo(v.get(i).password)==0) {
				login=1;
				JOptionPane.showMessageDialog(null, "welcome");
				return;
			}
			// Scenario2 if user enter invalid cradentials
			JOptionPane.showMessageDialog(null, "you enter invalid password");
			login=0;
			return;
		}
		}
		JOptionPane.showMessageDialog(null, "you enter invalid username");
		login=0;
	
		
	}
	
	
}
