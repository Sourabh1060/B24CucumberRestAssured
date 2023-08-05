package com.ApplicationUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApplicationUpStepDef {
	
	Response response;
	
	@Given("Hit the URI")
	public void hit_the_uri() {
		
	   response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	   System.out.println(" Got the response ");
	   
	    
	}

	@Then("Validate the respose of application.")
	public void validate_the_respose_of_application() {
	    
		response.then().log().all();
		System.out.println(" Validate the response");
		int ActuStatusCode = response.getStatusCode();
		int exptectedStatusCode = 200;
	
		
		org.junit.Assert.assertEquals(exptectedStatusCode, ActuStatusCode);
	}
	
	
	
}
