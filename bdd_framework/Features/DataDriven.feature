Feature: Data Driven Testing

Scenario: login using different username and password
Given user is on login page of app
When user valid login page of app
Then user enter Username as "aniket123" and Password as "pass123"
And user click on login btn

@ref
Scenario: login with valid and inalid data 
Given user is on login page of app
When user enter valid user name and valid password
|Username|Password|
|abcd|1234|
|xyz|aw12|
Then user click on login btn





