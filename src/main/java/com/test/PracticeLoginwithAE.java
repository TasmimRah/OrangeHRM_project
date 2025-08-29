package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeLoginwithAE {
	
	public void getLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.automationexercise.com/"); 
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("tasmimrah47@gmail.com");
		//NweYork2024
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("NweYork2024");
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
		if(driver.findElement(By.xpath("//*[text()=' Logout']")).isDisplayed()) {
			System.out.println("login is successful"); 
		}else {
			System.out.println("login failed"); 
		}
		driver.quit();
		
		
			
	}

}
