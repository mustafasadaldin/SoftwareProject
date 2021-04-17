package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;

import static org.junit.Assert.assertTrue;

public class AddBooksteps {

public Admin a;




	public AddBooksteps( Admin a) {
	
	
	this.a = a;
}
	@Given("the admin logged in")
	public void the_admin_logged_in(io.cucumber.datatable.DataTable dt) {
	    a.setLogin(1);
	    a.setLogout(0);
	    
	    Book.books.add(new Book());
	    Book.books.add(new Book());
	    Book.books.get(0).setTitle(dt.cell(0, 0));
	    Book.books.get(0).setAuthor(dt.cell(0, 1));
	    Book.books.get(0).setSignature(dt.cell(0, 2));
	    Book.books.get(0).setIsbn(dt.cell(0, 3));
	    
	    Book.books.get(1).setTitle(dt.cell(1, 0));
	    Book.books.get(1).setAuthor(dt.cell(1, 1));
	    Book.books.get(1).setSignature(dt.cell(1, 2));
	    Book.books.get(1).setIsbn(dt.cell(1, 3));
	}

	@When("the admin adds a book with title, author ,signature and ISBN")
	public void the_admin_adds_a_book_with_title_author_signature_and_isbn() {
	 Book.add(a.getLogin());
	}

	@Then("the book will be added to the system")
	public void the_book_will_be_added_to_the_system() {
	   assertTrue(Book.isAdded==true);
	}

	@Given("the admin logged out")
	public void the_admin_logged_out() {
		 a.setLogin(0);
		    a.setLogout(1);
	}

	@Then("the book will not  be added to the system")
	public void the_book_will_not_be_added_to_the_system() {
		 assertTrue(Book.isAdded==false);
	}


}