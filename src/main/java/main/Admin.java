package main;



import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Admin {
Scanner sc=new Scanner(System.in);
private String username="";
private String password="";
private int login;
private int logout=0;
public static ArrayList<Admin> v=new ArrayList<Admin>();

private Logger logger
= Logger.getLogger(
   Admin.class.getName());

 // Scenario1 login with valid cradentials
public void setPass(String pass) {
	this.password=pass;
}
public void setUser(String user) {
	this.password=user;
}
public void setLogin(int Lin) {
	this.login=Lin;
}
public void setLogout(int Lout) {
	this.logout=Lout;
}
public int getLogin() {
	return this.login;
}
public int getLogout() {
	return this.logout;
}



	public void loginInSys() {
		
		logger.log(Level.INFO, "username:");
		String s1=sc.next();
		logger.log(Level.INFO, "password:");
		String s2=sc.next();
		for(int i=0;i<v.size();i++) {
		if(s1.compareTo(v.get(i).username)==0) {
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
	public void logoutFromSys() {
		if(this.login==1) {
		login=0;
		logout=1;
		}
		
	}
	// SOME TEXT FOR TESTING
	//lkjskdfhkjsdfhkjdm
	
}