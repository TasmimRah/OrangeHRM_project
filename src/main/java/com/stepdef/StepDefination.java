
package com.stepdef;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pagefactory.MasterPagefactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;
	MasterPagefactory mpf; 
	@Given("Open the browser")
	public void open_the_browser() {
	  
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	}

	@Given("Pass the URL")
	public void pass_url(String URL) {
		mpf = new MasterPagefactory(driver);
		driver.navigate().to("https://www.automationexercise.com/");
	}

	@When("Click Login for login page")
	public void click_login_for_login_page() {
	    mpf.getSigninbtn_homepage().click();
	}

	@When("Enter email in the email field")
	public void enter_email(String email ) {
	    
	   mpf.getEmail().sendKeys("tasmimrah47@gmail.com");
	}

	@When("Enter Password in the password field")
	public void enter_password(String password ) {
	   mpf.getPassword().sendKeys("NweYork2024");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		mpf.getLogin_btn().click();
	    
	}

	@Then("Validate that Login is successful")
	public void login_successful() {
		Assert.assertTrue(mpf.getLogout_btn().isDisplayed(), "Login successful");
	    
	}
	
	@Then("Validate that login is successful")
	public void validate_that_login_is_successful() {
	    Assert.assertTrue(mpf.getLogin_btn().isDisplayed(), "login successful");
	}
	@Given("open the browser")
	public void open_browser() {
		
		driver = new ChromeDriver();
	
	}
	@Given("pass the URL {string}")
	public void pass_the_url(String URL) {
	   driver.navigate().to(URL);
	   mpf = new MasterPagefactory(driver);
	   
	}

	@Given("Click on login button for homepage")
	public void click_on_login_button_for_homepage() {
	   mpf.getSigninbtn_homepage().click();
	}
	@When("Enter email in the email field {string}")
	public void enter_email_in_the_email_field(String email) {
	   mpf.getEmail().sendKeys(email);
	}


@When("Enter Password in the password field {string}")
public void enter_password_in_the_password_field(String password) {
	mpf.getPassword().sendKeys(password);
    
}

	@When("click on login button")
	public void click_on_login_button() {
		
		mpf.getLogin_btn().click();
	    
	}











}
