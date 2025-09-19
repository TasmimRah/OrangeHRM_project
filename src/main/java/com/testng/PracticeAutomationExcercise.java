package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pagefactory.MasterPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomationExcercise {
	WebDriver driver;
	MasterPagefactory mpf;
	@Test
	public void getAutomationExcercise() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.automationexercise.com/");
		mpf = new MasterPagefactory(driver);
		//Highlighter.addColor(driver, mpf.getSigninbtn_homepage()) ;
		mpf.getSigninbtn_homepage().click();
		mpf.getEmail().sendKeys("tasmimrah47@gmail.com");
		mpf.getPassword().sendKeys("NweYork2024");
		mpf.getLogin_btn().click();
		 
		if(mpf.getLogin_btn().isDisplayed()) {
			System.out.println("Login successful");
		
			
			
		}else {
			System.out.println("Login failed");
		}
		Assert.assertTrue(mpf.getLogout_btn().isDisplayed(), "Login successful");
		//Screenshot.getScreenShot(driver, "Homepage") ;
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
