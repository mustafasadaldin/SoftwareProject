package test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Book;

public class searchsteps {
Book b;

	
	
	public searchsteps(Book b) {
	this.b = b;
}

	@Given("user want to search for book")
	public void user_want_to_search_for_book(io.cucumber.datatable.DataTable dt) {
	 b.books.add(new Book());
	 b.books.add(new Book());
	 b.books.add(new Book());
	  
	 b.books.get(0).title=dt.cell(0, 0);
	 b.books.get(0).author=dt.cell(0, 1);
	 b.books.get(0).ISBN=dt.cell(0, 2);
	 b.books.get(0).signature=dt.cell(0, 3);
	 
	 b.books.get(1).title=dt.cell(1, 0);
	 b.books.get(1).author=dt.cell(1, 1);
	 b.books.get(1).ISBN=dt.cell(1, 2);
	 b.books.get(1).signature=dt.cell(1, 3);
	 
	 b.books.get(2).title=dt.cell(2, 0);
	 b.books.get(2).author=dt.cell(2, 1);
	 b.books.get(2).ISBN=dt.cell(2, 2);
	 b.books.get(2).signature=dt.cell(2, 3);
	 
	}

	@When("user search for substring of title for existing book")
	public void user_search_for_substring_of_title_for_existing_book() {
	    b.SearchBookTitle();
	}
	
	@When("user search for substring of author for existing book")
public void user_search_for_substring_of_author_for_existing_book() {
		b.SearchBookAuthor();
   
}

@When("user search for substring of signeture for existing book")
public void user_search_for_substring_of_signeture_for_existing_book() {
   b.SearchBookSig();
}


@When("user search for substring of isbn for existing book")
public void user_search_for_substring_of_isbn_for_existing_book() {
   b.SearchBookISBN();
}


	@Then("the book must be found")
	public void the_book_must_be_found() {
	   assertTrue(b.j==1);
	}
	
	/*
	@When("user search for a book parameter that does not exist")
public void user_search_for_a_book_parameter_that_does_not_exist() {
		b.SearchBookISBN();
}

@Then("massege tell him it is not here must be shown")
public void massege_tell_him_it_is_not_here_must_be_shown() {
    
}
*/
@When("user search for a book parameter that included in more than book")
public void user_search_for_a_book_parameter_that_included_in_more_than_book() {
    b.SearchBookTitle();
}

@Then("all books must be found")
public void all_books_must_be_found() {
    assertTrue(b.j>1);
}




	
	
}
