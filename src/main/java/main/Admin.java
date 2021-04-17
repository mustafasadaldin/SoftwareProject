package main;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;

import javax.swing.JOptionPane;

import jdk.jfr.internal.Logger;
public class Admin {
Scanner sc=new Scanner(System.in);
public String username="";
public String password="";
public int login;
public int logout=0;
public static ArrayList<Admin> v=new ArrayList<Admin>();




 // Scenario1 login with valid cradentials
	public void login(String user,String pass) {
	     String s1=user;
	     String s2=pass;
		for(int i=0;i<v.size();i++) {
		if(s1.compareTo(v.get(i).username)==0) {//need refactor (extract)++inline refactoring
			if(s2.compareTo(v.get(i).password)==0) {
				login=1;
				logout=0;
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
	
	public void logout() {
		if(this.login==1) {
		login=0;
		logout=1;
		}
		
	}
}
	
	