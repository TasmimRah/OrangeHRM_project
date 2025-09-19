package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pagefactory.MasterPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropDown {
	MasterPagefactory mpf;
	@Test
	public void getDropDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/select-menu");
		mpf = new MasterPagefactory(driver);
	    Select sc = new Select(mpf.getDropdown());
	    sc.selectByVisibleText("White");
		
	}

}
