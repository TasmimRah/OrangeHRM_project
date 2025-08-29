package com.pagefactory;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPagefactory {
	public MasterPagefactory(WebDriver driver) {
		PageFactory.initElements(driver, this);    
	}
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement signinbtn_homepage; 
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="(//*[@class='btn btn-default'])[1]")
	private WebElement login_btn;
	
	@FindBy(xpath="//*[text()='Services']")
	private WebElement costco_services;
	@FindBy(xpath="//*[@id='oldSelectMenu']")
	private WebElement dropdown;
	
	@FindBy(xpath="//*[@id='confirmBox']")
	private WebElement alertbtn;
	
	public WebElement getAmazonGrocery() {
		return AmazonGrocery;
	}
	@FindBy(xpath="//*[@id='promptBox']")
	private WebElement alertbtn2;
	
	
	@FindBy(xpath="//*[text()='Groceries']")
	private WebElement AmazonGrocery;
	
	
	@FindBy(xpath="(//*[@class='f3-cgi-flyout-store-img'])[1]")
	private WebElement AmazonGroceryFresh;
	
	public WebElement getAmazonGroceryFresh() {
		return AmazonGroceryFresh;
	}

	public WebElement getAlertbtn2() {
		return alertbtn2;
	}

	public WebElement getAlertbtn() {
		return alertbtn;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getCostco_services() {
		return costco_services;
	}

	public WebElement getSigninbtn_homepage() {
		return signinbtn_homepage;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}
	@FindBy(xpath="//*[text()=' Logout']")
	private WebElement logout_btn;

}
