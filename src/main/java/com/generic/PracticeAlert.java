package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.MasterPagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlert {
	public void getAlert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		
		MasterPagefactory mpf = new MasterPagefactory(driver);
		mpf.getAlertbtn2().click()	;
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());   
		alert.sendKeys("Tasmim");     
	
	alert.accept();
		
		}
public static void main(String[] args) {
	PracticeAlert obj = new PracticeAlert();
	obj.getAlert();
} 
}
