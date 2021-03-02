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

Scenario Outline: Searching also works when the user/administrator is logged in
Given the admin or user is logged in
When user search for substring of <sub> for book
Then the book must be found  
Examples:
|sub|
|title|
|author|
|signeture|
|isbn|

Scenario Outline: No books match the criteria (substring)
When user search for substring of <substring from> for non existing book
Then no book must be found
Examples:
|substring from|
|title|
|author|
|signeture|
|isbn|

Scenario: Find more than one book
When user search for a book parameter that included in more than book
Then all books must be found