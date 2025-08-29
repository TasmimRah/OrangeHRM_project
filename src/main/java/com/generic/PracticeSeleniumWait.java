package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPagefactory;
import com.sun.tools.javac.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSeleniumWait {
	public void getWait() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		MasterPagefactory mpf = new MasterPagefactory(driver);
		WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getAmazonGrocery()));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getAmazonGrocery()).perform();
		mpf.getAmazonGroceryFresh().click();
		
		
		
		
	}
	public static void main(String[] args) {
		PracticeSeleniumWait obj = new PracticeSeleniumWait();
		obj.getWait();
		
	}     
}
