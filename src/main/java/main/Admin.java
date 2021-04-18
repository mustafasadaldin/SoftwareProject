package main;



import java.util.ArrayList;
import java.util.List;
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
private  List<Admin> v=new ArrayList<Admin>();

private Logger logger
= Logger.getLogger(
   Admin.class.getName());

 // Scenario1 login with valid cradentials
public void setPass(String pass) {
	this.password=pass;
}
public void setUser(String user) {
	this.username=user;
}
public void setLogin(int lIN) {
	this.login=lIN;
}
public void setLogout(int lOUT) {
	this.logout=lOUT;
}
public int getLogin() {
	return this.login;
}
public int getLogout() {
	return this.logout;
}
public Admin getAd(int i) {
	
	return v.get(i);
	
}

public  void setAd() {
	v.add(new Admin());
	
}


	public void loginInSys(String sS,String sS1 ) {
		
		
		String s1=sS;		
		String s2=sS1;
		
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
	
	
	
	
}