package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class PracticeAnnotations {
	
	@BeforeClass
	public void getSearch() {
		System.out.println("This is search method "); 
		
	}

	@BeforeSuite
	public void getCart() {
		System.out.println("This is Cart method "); 
	}
	@AfterTest
	public void getPayment() {
		System.out.println("This is Payment method "); 
	}

}
