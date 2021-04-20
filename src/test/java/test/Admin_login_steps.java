package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;

public class Admin_login_steps {
	
	
	Admin ad;
	// using pekocucumbder dependency to initiallize the reference by object	
	
public Admin_login_steps( Admin ad) {
		
		
		this.ad = ad;
	}


	@Given("admin want to login")
	public void admin_want_to_login(io.cucumber.datatable.DataTable dt) {
		storeAdmins(dt);		
				
}


	private void storeAdmins(io.cucumber.datatable.DataTable dt) {
		ad.setAd();
		ad.setAd();
		ad.setAd();
		ad.getAd(0).setUser(dt.cell(0, 0));
		ad.getAd(0).setPass(dt.cell(0, 1));
		ad.getAd(1).setUser(dt.cell(1, 0));
		ad.getAd(1).setPass(dt.cell(1, 1));		
		ad.getAd(2).setUser(dt.cell(2, 0));
		ad.getAd(2).setPass(dt.cell(2, 1));
	}

	
	

	@When("admin login valid cradentials")
	public void admin_login_valid_cradentials() {
	    ad.loginInSys("mustafa2021@gmail.com","mustafa");
	   
	}

	@Then("admin should be logged in")
	public void admin_should_be_logged_in() {
	   assertEquals(1,ad.getLogin());
	}

	
	@When("admin  login with wrong password... invalid cradentials")
	public void admin_login_with_wrong_password_invalid_cradentials() {
		ad.loginInSys("mustafa2021@gmail.com","mustafaghhghghh");
	}

	@Then("admin should not be loged in")
	public void admin_should_not_be_loged_in() {
	   assertEquals(0,ad.getLogin());
	}

	
	
	
}