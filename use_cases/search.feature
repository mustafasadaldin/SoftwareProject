Feature: search book
Background:
Given user want to search for book
|webdesign|mustafa|1234567891|mustafa|
|java prog|amro|123456784|amro|
|database|adel|1234567896|adel|

Scenario:
When user search for substring of title for existing book
Then the book must be found

Scenario:
When user search for substring of author for existing book 
Then the book must be found

Scenario:
When user search for substring of signeture for existing book
Then the book must be found

Scenario:
When user search for substring of isbn for existing book
Then the book must be found

Scenario Outline:
When user search for a <book parameter> that included in more than book
Then all books must be found
Examples:
|book parameter|
| title |
| signeture |
| isbn |
| author |
