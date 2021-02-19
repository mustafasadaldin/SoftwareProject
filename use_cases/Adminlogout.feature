Feature: Admin logout

Scenario: Administrator logs out
Given the admin  has been logged in
|mustafa2021@gmail.com|mustafa|
|amraboamr2021@gmail.com|amraboamr|
|adel2021@gmail.com|adel|
When the admin click logout 
Then the admin should be logged out

