package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;

public class Admin_login_steps {
	private String username;
	private String password;
	
	Admin ad;
	// using pekocucumbder dependency to initiallize the reference by object	
	
public Admin_login_steps( Admin ad) {
		
		
		this.ad = ad;
	}


	@Given("admin want to login")
	public void admin_want_to_login(io.cucumber.datatable.DataTable dt) {
		ad.v.add(new Admin());
		ad.v.add(new Admin());
		ad.v.add(new Admin());
		ad.v.get(0).username=dt.cell(0, 0);
		ad.v.get(0).password=dt.cell(0, 1);
		ad.v.get(1).username=dt.cell(1, 0);
		ad.v.get(1).password=dt.cell(1, 1);
		ad.v.get(2).username=dt.cell(2, 0);
		ad.v.get(2).password=dt.cell(2, 1);
		
		
				
	}

	
	

	@When("admin login valid cradentials")
	public void admin_login_valid_cradentials() {
	    ad.login();
	   
	}

	@Then("admin should be logged in")
	public void admin_should_be_logged_in() {
	   assertTrue(ad.login==1);
	}

	
	@When("admin  login with wrong password... invalid cradentials")
	public void admin_login_with_wrong_password_invalid_cradentials() {
		ad.login();
	}

	@Then("admin should not be loged in")
	public void admin_should_not_be_loged_in() {
	   assertTrue(ad.login==0);
	}

	
	
	
}