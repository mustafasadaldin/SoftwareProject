package test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;

public class Admin_logout_steps {
	public Admin a;
	
	public Admin_logout_steps(Admin a) {

		this.a = a;
	}

	@Given("the admin  has been logged in")
	public void the_admin_has_been_logged_in() {
		a.login=1;
		a.logout=0;
	}

	@When("the admin click logout")
	public void the_admin_click_logout() {
	  a.logout();
	}

	@Then("the admin should be logged out")
	public void the_admin_should_be_logged_out() {
	   assertTrue(a.logout==1 && a.login==0) ;
	}
	
	
	
}
