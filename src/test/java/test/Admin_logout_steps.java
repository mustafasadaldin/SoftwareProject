package test;

import static org.junit.Assert.assertEquals;

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
	   
	a.setLogin(1);
	a.setLogout(0);
	}

	@When("the admin click logout")
	public void the_admin_click_logout() {
	  a.logoutFromSys();
	}

	@Then("the admin should be logged out")
	public void the_admin_should_be_logged_out() {
	   assertEquals(1,a.getLogout());
		assertEquals(0,a.getLogin());
	}
	
	
	
}