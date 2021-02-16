Feature: admin login
Scenario: Administrator can log in with valid credentials
Given admin has valid cradentials
When admin make login action
Then admin should be logged in


Scenario: Administrator has the wrong password
Given admin login in with wrong password... invalid cradentials
When admin make log in action
Then error message should be viewd 
