package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_StepDef {

	// api 4 : Post Get Update Delete
	
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    System.out.println("Step : Login with admin user ");
	}

	@Then("Validate user getting searched")
	public void validate_user_getting_searched() {
	    System.out.println(" Step : validate user getting seached ");
	}
	
	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
	   System.out.println(" Go to PIM Tab ");
	}
	
	@Given("Validate user not getting searched.")
	public void validate_user_not_getting_searched() {
	    System.out.println(" Step : validate user not getting searched");
	}
	
	
	
}
