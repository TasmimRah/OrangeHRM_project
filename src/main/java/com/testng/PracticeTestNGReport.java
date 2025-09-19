package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class PracticeTestNGReport {
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void getSEtUp() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("target/OrangeHRM.html");
		reporter.config().setDocumentTitle("Testng Automation");
		reporter.config().setReportName("Smoke test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));

		
		
	}
	@Test
	public void getLogin() {
		PracticeAutomationExcercise obj = new PracticeAutomationExcercise();
		obj.getAutomationExcercise();
		test = extent.createTest("Login test");
	}
	@AfterTest
	public void getRun() {
		extent.flush();
	}


}
