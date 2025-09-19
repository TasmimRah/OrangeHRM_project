Feature: Login Functionality Testing
#Description: User should lo0gin with valid cradential 
#Background: User should lo0gin with valid cradential
Scenario: As a Automation Excercise user, i wanna login with valid credential, so that i can use the website
Given Open the browser 
And Pass the URL
|https://www.automationexercise.com/|
When Click Login for login page
And Enter email in the email field
|tasmimrah47@gmail.com|

And  Enter Password in the password field
|NweYork2024|

And Click on the Login button 
Then Validate that Login is successful
@regression
Scenario Outline: As an Automation excercise user, I want to login with multiple valid credential, 
so that I can use the website
Given Open the browser
And pass the URL "<URL>"
When Click Login for login page

And Enter email in the email field "<email>"
And Enter Password in the password field "<password>"
And Click on the Login button
Then Validate that login is successful
Examples:
|URL                                |email                   |password   |
|https://www.automationexercise.com/|tasmimrah47@gmail.com   |NweYork2024|
|https://www.automationexercise.com/|rezwanislam857@gmail.com|Boston2023 |
