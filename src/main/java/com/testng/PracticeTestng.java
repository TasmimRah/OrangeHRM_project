package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestng {
	@Test (priority = 1)
	public void getSearch() {
		System.out.println("This is Search method"); 
	}
	@Test (priority = 2,groups = {"smoke"}    )
	public void getCart() {
		System.out.println("This is cart method");
	}
	@Test (priority = 3, dependsOnMethods = {"getSearch","getCart"},groups = {"smoke","regression"}   )
	public void getPayment() {
		System.out.println("This is Payment method");
	}
	@Test(priority = 4,groups = {"functional"}  )
	public void getRturn() {
		System.out.println("This is Return method");
	}

}
