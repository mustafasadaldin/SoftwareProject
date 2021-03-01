Feature: search book
Background:
Given user want to search for book
|webdesign|mustafa|1234567891|mustafa|
|java prog|amro|123456784|amro|
|database|adel|1234567896|adel|

Scenario:
When user search for substring of title for book
Then the book must be found

Scenario:
When user search for substring of author for book
Then the book must be found

Scenario:
When user search for substring of signeture for book
Then the book must be found

Scenario:
When user search for substring of isbn for book
Then the book must be found

Scenario: Searching also works when the user/administrator is logged in
Given the admin or user is logged in
When admin or user makes any book searching
Then the book must be found  

Scenario: No books match the criteria (substring)
When user search for substring of title for non existing book
When user search for substring of author for non existing book
When user search for substring of signeture for non existing book
When user search for substring of isbn for non existing book
Then no book must be found



Scenario: Find more than one book
When user search for a book parameter that included in more than book
Then all books must be found