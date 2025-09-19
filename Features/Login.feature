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


