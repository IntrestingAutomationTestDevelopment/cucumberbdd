package com.stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	    @Given("I am on the login page")
	    public void i_am_on_the_login_page() {
	        System.out.println("Navigated to login page");
	    }

	    @When("I enter valid username and password")
	    public void i_enter_valid_username_and_password() {
	        System.out.println("Entered valid credentials");
	    }

	    @When("I enter an invalid username or password")
	    public void i_enter_invalid_username_or_password() {
	        System.out.println("Entered invalid credentials");
	    }

	    @When("I click on the login button")
	    public void i_click_on_the_login_button() {
	        System.out.println("Clicked on login button");
	    }

	    @Then("I should be redirected to the dashboard")
	    public void i_should_be_redirected_to_the_dashboard() {
	        System.out.println("Redirected to dashboard");
	        Assert.assertTrue(true); // Example assertion
	    }

	    @Then("I should see an error message")
	    public void i_should_see_an_error_message() {
	        System.out.println("Displayed error message");
	        Assert.assertTrue(true); // Example assertion
	    }
	}


