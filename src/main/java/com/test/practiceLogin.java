package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPagefactory;
import com.util.BaseConfig;
import com.util.HIGHLIGHTER;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceLogin {
	
	MasterPagefactory mpf;
	public void getSalary() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(BaseConfig.getConfigValue("PROD_URL")); 
		
		mpf = new MasterPagefactory(driver);
		
		
		HIGHLIGHTER.addColor(driver,   mpf.getSigninbtn_homepage());
         mpf.getSigninbtn_homepage().click();
		mpf.getEmail().sendKeys(BaseConfig.getConfigValue("EMAIL"));
		//NweYork2024
	mpf.getPassword().sendKeys(BaseConfig.getConfigValue("Password"));
	mpf.getLogin_btn().click();
		if(mpf.getLogout_btn().isDisplayed()) {
			System.out.println("login is successful"); 
		}else {
			System.out.println("login failed"); 
		}
		Screenshot.getScreenShot(driver, "Homepage_SS");
		driver.quit();
		
		
			
	}

}
