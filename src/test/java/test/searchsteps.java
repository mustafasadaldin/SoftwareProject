package test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;
import main.User;

public class searchsteps {
	Book b;
	User u;
	Admin a;

		
		
		

		public searchsteps(Book b,User u,Admin a) {
		
		this.b = b;
		this.u =u;
		this.a=a;
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
	
	
	

@When("user search for a title that included in more than book")
public void user_search_for_a_title_that_included_in_more_than_book() {
   b.SearchBookTitle();
}



@When("user search for a signeture that included in more than book")
public void user_search_for_a_signeture_that_included_in_more_than_book() {
   b.SearchBookSig();
}

@When("user search for a isbn that included in more than book")
public void user_search_for_a_isbn_that_included_in_more_than_book() {
  b.SearchBookISBN();
}

@When("user search for a author that included in more than book")
public void user_search_for_a_author_that_included_in_more_than_book() {
  b.SearchBookAuthor();
}

@Then("all books must be found")
public void all_books_must_be_found() {
    assertTrue(b.j>1);
}

@When("user search for substring of title for non existing book")
public void user_search_for_substring_of_title_for_non_existing_book() {
   b.SearchBookTitle();
}


@When("user search for substring of author for non existing book")
public void user_search_for_substring_of_author_for_non_existing_book() {
   b.SearchBookAuthor();
}

@When("user search for substring of signeture for non existing book")
public void user_search_for_substring_of_signeture_for_non_existing_book() {
    b.SearchBookSig();
}


@When("user search for substring of isbn for non existing book")
public void user_search_for_substring_of_isbn_for_non_existing_book() {
    b.SearchBookISBN();
}

@Then("no book must be found")
public void no_book_must_be_found() {
	 assertTrue(b.j==0);
   
}

@Given("the admin or user is logged in")
public void the_admin_or_user_is_logged_in() {
	a.login=1;
	a.logout=0;
	
	u.login=true;
	u.logout=false;
	
  
}

@When("user search for substring of title for book")
public void user_search_for_substring_of_title_for_book() {
    b.SearchBookTitle();
}

@When("user search for substring of author for book")
public void user_search_for_substring_of_author_for_book() {
	b.SearchBookAuthor();

}

@When("user search for substring of signeture for book")
public void user_search_for_substring_of_signeture_for_book() {
b.SearchBookSig();
}


@When("user search for substring of isbn for book")
public void user_search_for_substring_of_isbn_for_book() {
b.SearchBookISBN();
}

	
	
}
