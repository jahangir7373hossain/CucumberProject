package com.qa.stepDefination;

import static org.junit.Assert.assertEquals;

import com.qa.utils.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SignInTest extends TestBase {
	
	

	@Given("^User open the app$")
	public void user_open_the_app() throws Throwable {
		setUp();			
	}
		
	

	@Then("^User valiadte all sign in property there$")
	public void user_valiadte_all_sign_in_property_there() throws Throwable {
	
			String myOptimumIDHeader = signinPage.optimumIDHeader.getText();
			String myOptimumPass = signinPage.optimumPassHeader.getText();
			String submit = signinPage.submitButton.getText();
			Assert.assertEquals("My Optimum ID", myOptimumIDHeader);
			Assert.assertEquals("Password", myOptimumPass);
			assertEquals("Sign in to Optimum.net", submit);
			
		
		
	}

	@Then("^User insert \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_insert_and(String username, String password) throws Throwable {
		signinPage.OptimumSignIn(username, password);
		
		String ErrorMessage = signinPage.errorMessage.getText();
		Assert.assertEquals("Incorrect Optimum ID or password.", ErrorMessage);
	}


	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		classTearDown();
	}

}
