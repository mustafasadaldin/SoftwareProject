package test;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;


public class searchsteps {
	Book b;
	
	Admin a;

		
		
		

		public searchsteps(Book b,Admin a) {
		
		this.b = b;
		
		this.a=a;
		}

	@Given("user want to search for book")
	public void user_want_to_search_for_book(io.cucumber.datatable.DataTable dt) {
		b.setB();
		b.setB();
		b.setB();
	  
		 b.getB(0).setTitle(dt.cell(0, 0));
		 b.getB(0).setAuthor(dt.cell(0, 1));
		 b.getB(0).setIsbn(dt.cell(0, 2));
		 b.getB(0).setSignature(dt.cell(0, 3));
		 b.getB(1).setTitle(dt.cell(1, 0));
		 b.getB(1).setAuthor(dt.cell(1, 1));
		 b.getB(1).setIsbn(dt.cell(1, 2));
		 b.getB(1).setSignature(dt.cell(1, 3));
	 
		 b.getB(2).setTitle(dt.cell(2, 0));
		 b.getB(2).setAuthor(dt.cell(2, 1));
		 b.getB(2).setIsbn(dt.cell(2, 2));
		 b.getB(2).setSignature(dt.cell(2, 3));
	 
	}

	@When("user search for substring of title for existing book")
	public void user_search_for_substring_of_title_for_existing_book() {
	    b.searchBookTitle("java");
	}
	
	@When("user search for substring of author for existing book")
public void user_search_for_substring_of_author_for_existing_book() {
		b.searchBookAuthor("must");
   
}

@When("user search for substring of signeture for existing book")
public void user_search_for_substring_of_signeture_for_existing_book() {
   b.searchBookSig("must");
}


@When("user search for substring of isbn for existing book")
public void user_search_for_substring_of_isbn_for_existing_book() {
   b.searchBookISBN("891");
}


	@Then("the book must be found")
	public void the_book_must_be_found() {
	   assertEquals(1,b.getJ());
	}
	
	
	

@When("user search for a title that included in more than book")
public void user_search_for_a_title_that_included_in_more_than_book() {
   b.searchBookTitle("a");
}



@When("user search for a signeture that included in more than book")
public void user_search_for_a_signeture_that_included_in_more_than_book() {
   b.searchBookSig("m");
}

@When("user search for a isbn that included in more than book")
public void user_search_for_a_isbn_that_included_in_more_than_book() {
  b.searchBookISBN("123");
}

@When("user search for a author that included in more than book")
public void user_search_for_a_author_that_included_in_more_than_book() {
  b.searchBookAuthor("m");
}

@Then("all books must be found")
public void all_books_must_be_found() {
    assertTrue(b.getJ()>1);
}

@When("user search for substring of title for non existing book")
public void user_search_for_substring_of_title_for_non_existing_book() {
   b.searchBookTitle("kkjkjjk");
}


@When("user search for substring of author for non existing book")
public void user_search_for_substring_of_author_for_non_existing_book() {
   b.searchBookAuthor("kjlkjjkkj");
}

@When("user search for substring of signeture for non existing book")
public void user_search_for_substring_of_signeture_for_non_existing_book() {
    b.searchBookSig("jkljkljkl");
}


@When("user search for substring of isbn for non existing book")
public void user_search_for_substring_of_isbn_for_non_existing_book() {
    b.searchBookISBN("99999");
}

@Then("no book must be found")
public void no_book_must_be_found() {
	 assertEquals(0,b.getJ());
   
}

@Given("the admin or user is logged in")
public void the_admin_or_user_is_logged_in() {
	a.setLogin(1);
	a.setLogout(0);
	
	
	
  
}

@When("user search for substring of title for book")
public void user_search_for_substring_of_title_for_book() {
    b.searchBookTitle("java");
}

@When("user search for substring of author for book")
public void user_search_for_substring_of_author_for_book() {
	b.searchBookAuthor("must");

}

@When("user search for substring of signeture for book")
public void user_search_for_substring_of_signeture_for_book() {
b.searchBookSig("must");
}


@When("user search for substring of isbn for book")
public void user_search_for_substring_of_isbn_for_book() {
b.searchBookISBN("891");
}

	
	
}