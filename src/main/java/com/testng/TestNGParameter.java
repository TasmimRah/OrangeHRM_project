package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	@Test
	@Parameters("myName")
	public void getMoney(String myName) {
		System.out.println(myName); 
	}

}
