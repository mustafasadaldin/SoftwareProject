Feature: admin login

Background:
Given admin want to login
|mustafa2021@gmail.com|mustafa|
|amraboamr2021@gmail.com|amraboamr|
|adel2021@gmail.com|adel|

Scenario: Administrator can log in with valid credentials 
When admin login valid cradentials
Then admin should be logged in



Scenario: Administrator has the wrong password
When admin  login with wrong password... invalid cradentials
Then admin should not be loged in 