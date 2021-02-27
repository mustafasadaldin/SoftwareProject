Feature: Add book
Scenario: Add a book when the administrator is logged in
Given the admin logged in 
When the admin adds a book with title, author ,signature and ISBN 
Then the book will be added to the system



Scenario: Add a book when the administrator is not logged in
Given the admin logged out 
When the admin adds a book with title, author ,signature and ISBN    
Then the book will not  be added to the system