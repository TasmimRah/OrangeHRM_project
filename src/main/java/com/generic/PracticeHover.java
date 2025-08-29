package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeHover {
	MasterPagefactory mpf;
	public void getHover() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		mpf = new MasterPagefactory(driver);
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getAmazonGrocery()).perform();
	}
	public static void main(String[] args) {
		PracticeHover obj = new PracticeHover();
		obj.getHover();;
	}   

}
