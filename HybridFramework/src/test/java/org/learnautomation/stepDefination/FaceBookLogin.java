package org.learnautomation.stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLogin {

	@Given("^Open Firefox and open application$")
	public void open_Firefox_and_open_application() throws Throwable {
		System.out.println("Facebook started");
	}
	@When("^I enter Mukesh and Otwani$")
	public void i_enter_Mukesh_and_Otwani() throws Throwable {
	    
	}


	@Then("^user should be able to login to application$")
	public void user_should_be_able_to_login_to_application() throws Throwable {
		System.out.println("Facebook login");

	}

}
