package com.runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber.json",
		},

		features = { "src/test/resources/Login.feature", "Features/ScenarioOutline.feature" }, 
		glue = { "com.stepdef" }, // package name
		monochrome = true, //remove all ?? & console will be easily readable
dryRun = true //check feature file

//In Cucumber 6 and above (you're using Cucumber 7.14.0), the strict option has been removed. That’s why you’re getting this error.

		// ,tags= {"@Function"}

)

public class LoginRunner extends AbstractTestNGCucumberTests {

@BeforeTest
public void setup() {
	//setup code
}
}
