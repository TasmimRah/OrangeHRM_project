package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.MasterPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdown {
	public void getDropDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/select-menu");
		MasterPagefactory mpf = new MasterPagefactory(driver);
		Select sc = new Select(mpf.getDropdown());
		sc.selectByVisibleText("White");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.selectByIndex(3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.selectByValue("5");
	
		
	}
	public static void main(String[] args) {
		PracticeDropdown obj = new PracticeDropdown();
		obj.getDropDown();
	}   

}
