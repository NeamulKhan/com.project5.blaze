package stepDefination_project5;

import cucumber.api.java.en.Given;
import utility.BaseClass_project5;

public class StepDefination_project5 extends BaseClass_project5 {
	

@Given("^Launch \"([^\"]*)\"$")
public void launch(String URL) throws Throwable {
  
	launchURL(URL);
	
}

}
