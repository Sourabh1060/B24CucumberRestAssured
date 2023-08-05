package com.GetValidateValuesWithParam;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetValidation {

	Response response;

	@Given("Hit the URI")
	public void hit_the_uri() {

		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		System.out.println(" Got the response ");
	}

	@Then("Validate the title {string} and pages \"{int}\" of an application.")
	public void validate_the_title_and_pages_of_an_application(String string, Integer int1) {
		
		String dataString = response.getBody().asString();
		System.out.println(" All Data  === "+dataString);
		
	}

}
