package cucumberbdd.test;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramPostStepDefinition {

	/**
	 * Sending Request Body using “HashMap”
	 */

	/*
	 * @Given("^User sets request for Program Module with valid base URL and valid request body$"
	 * )
	 * 
	 * public void
	 * user_sets_request_for_program_module_with_valid_base_url_and_valid_request_body
	 * () {
	 * 
	 * this.uri = Config.PostProgram_URL;
	 * 
	 * this.request =
	 * RestAssured.given().header("^Content-Type”, “application/json$");
	 * 
	 * logger.
	 * info("^Request set for Program module with valid base URL and valid data$");
	 * 
	 * }
	 * 
	 * @When("^User sends POST request with valid data$")
	 * 
	 * 
	 * public void user_sends_post_request_with_valid_data() {
	 * 
	 * HashMap data = new HashMap();
	 * 
	 * data.put("studentName", "John");
	 * 
	 * data.put("programName", "BusinessAnalytics");
	 * 
	 * data.put("programType", "Graduate");
	 * 
	 * data.put("location", "Boston");
	 * 
	 * response =
	 * this.request.body(data).when().post(this.uri).then().log().all().extract().
	 * response();
	 * 
	 * logger.info("^Post request sent with valid data$");
	 * 
	 * }
	 * 
	 * @Then("^Request should be successful with status code {string} for POST request $"
	 * )
	 * 
	 * public void
	 * request_should_be_successful_with_status_code_for_post_request(String
	 * statuscode) {
	 * 
	 * int Poststatuscode = response.getStatusCode();
	 * 
	 * if (Poststatuscode == 201) {
	 * 
	 * response.then().statusCode(Integer.parseInt(statuscode));
	 * 
	 * logger.info("^Post Request Successful$");
	 */
}
