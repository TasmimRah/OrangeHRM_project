 @regression
Feature: Login Functionality Testing 
Description: Users should login with valid credential
Background: Users should login with valid credential
Scenario Outline: As a Automation exercise user, I wanna login with valid credential,
 so that I can use the website

 Given open the browser
 And pass the URL "<URL>"
 And Click on login button for homepage
 When Enter email in the email field "<email>"
 And Enter Password in the password field "<password>"
 And click on login button 
 Then Validate that login is successful
 Examples:
|URL                                |email                   |password   |
|https://www.automationexercise.com/|tasmimrah47@gmail.com   |NweYork2024|
|https://www.automationexercise.com/|rezwanislam857@gmail.com|Boston2023 |