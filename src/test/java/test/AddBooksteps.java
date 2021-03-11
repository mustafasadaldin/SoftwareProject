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
	public void the_admin_logged_in(io.cucumber.datatable.DataTable dt) {
	    a.login=1;
	    a.logout=0;
	    
	    Book.books.add(new Book());
	    Book.books.add(new Book());
	    Book.books.get(0).title=dt.cell(0, 0);
	    Book.books.get(0).author=dt.cell(0, 1);
	    Book.books.get(0).signature=dt.cell(0, 2);
	    Book.books.get(0).ISBN=dt.cell(0, 3);
	    
	    Book.books.get(1).title=dt.cell(1, 0);
	    Book.books.get(1).author=dt.cell(1, 1);
	    Book.books.get(1).signature=dt.cell(1, 2);
	    Book.books.get(1).ISBN=dt.cell(1, 3);
	}

	@When("the admin adds a book with title, author ,signature and ISBN")
	public void the_admin_adds_a_book_with_title_author_signature_and_isbn() {
	 b.add(a.login);
	}

	@Then("the book will be added to the system")
	public void the_book_will_be_added_to_the_system() {
	   assertTrue(b.isAdded==true);
	}

	@Given("the admin logged out")
	public void the_admin_logged_out() {
		 a.login=0;
		    a.logout=1;
	}

	@Then("the book will not  be added to the system")
	public void the_book_will_not_be_added_to_the_system() {
		 assertTrue(b.isAdded==false);
	}


}