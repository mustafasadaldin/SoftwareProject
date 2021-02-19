Feature: Add book
Scenario Outline: Add a book when the administrator is logged in
Given the admin logged in 
When the admin adds a book with <title> <author> <signature> <ISBN-10>  
Then the book will be added to the system
Examples:
|title|author|signature|ISBN-10|
|"Test-Drivenest Driven Development"|"Kent Beck"|"Beck2002"|"9780321146533"|
|"The Four Winds"|"Kristin Hannah"|"Hannah2021"|"1250178606"|
|"Software Engineering at Google"|"om Manshreck"|"Manshreck2018"|"0805047905"|

Scenario Outline: Add a book when the administrator is not logged in
Given the admin logged out 
When the admin adds a book with <title> <author> <signature> <ISBN-10>  
Then the book will not  be added to the system
Examples:
|title|author|signature|ISBN-10|
|"Test-Drivenest Driven Development"|"Kent Beck"|"Beck2002"|"9780321146533"|


