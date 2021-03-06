Feature: Add book
Scenario: Add a book when the administrator is logged in
Given the admin logged in 
|web2021|mustafa|must|1234567896|
|web26545641|amr|am22|1234567812|
When the admin adds a book with title, author ,signature and ISBN 
Then the book will be added to the system



Scenario: Add a book when the administrator is not logged in
Given the admin logged out 
When the admin adds a book with title, author ,signature and ISBN    
Then the book will not  be added to the system


