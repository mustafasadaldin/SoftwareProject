package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;

import static org.junit.Assert.assertTrue;

public class AddBooksteps {
public Book b;
public Admin a;




	public AddBooksteps(Book b, Admin a) {
	
	this.b = b;
	this.a = a;
}
	@Given("the admin logged in")
	public void the_admin_logged_in() {
	    a.login=1;
	    a.logout=0;
	}

	@When("the admin adds a book with title, author ,signature and ISBN")
	public void the_admin_adds_a_book_with_title_author_signature_and_isbn() {
	 b.add(a.login);
	}

	@Then("the book will be added to the system")
	public void the_book_will_be_added_to_the_system() {
	   assertTrue(b.flag==true);
	}

	@Given("the admin logged out")
	public void the_admin_logged_out() {
		 a.login=0;
		    a.logout=1;
	}

	@Then("the book will not  be added to the system")
	public void the_book_will_not_be_added_to_the_system() {
		 assertTrue(b.flag==false);
	}


}