package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pagefactory.MasterPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestingWithTestNG {
	WebDriver driver;
	MasterPagefactory mpf;
	@Test
	@Parameters({"browser"})
	
	
	
	public void getCrossBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			
			driver = new ChromeDriver();
			System.out.println("Browser open="+browser);    
			
			
		}else if(browser.equalsIgnoreCase("Safari")) {
			
		WebDriverManager.safaridriver() .setup();
		driver = new SafariDriver();
		System.out.println("Browser open="+browser); 
			
		}else {
			System.out.println("browser not found");   
		}
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
		driver.quit();
		
		
		
	}



		
	}


