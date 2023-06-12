package testRunner_project5;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.BaseClass_project5;



@CucumberOptions(features = {"src/test/resource/FeatureFolder_project5"},
plugin = {"json:target/cucumber.json"},

glue ="stepDefination_project5", tags= {"@Signup"}

)

public class TestRunner_project5 extends AbstractTestNGCucumberTests {
	

	@BeforeTest
	
	public void blazesetup() throws Exception {
		
		BaseClass_project5 test = new BaseClass_project5();
		
		
		test.blazebrowserinit();
	}
	
	@AfterTest
	
	public void blazeClosureURL() {
	
		BaseClass_project5 test = new BaseClass_project5();
		
		//test.driver.quit();
	}


}

	

