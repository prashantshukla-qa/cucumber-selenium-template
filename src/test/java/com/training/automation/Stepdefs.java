package com.training.automation;

import com.training.automation.pagekeywords.BaseClass;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {

    BaseClass test;

    @Before
    public void setUp() {
        test = new BaseClass();
    }

    @Given("I am on the application Landing Page")
    public void i_am_on_the_application_landing_page() {
        test.launchApplication();
    }

    @When("I Navigate to the Sign In Page")
    public void i_navigate_to_the_sign_in_page() {
        test.landingPage.navigateToLoginPage();
    }

    @When("I enter the username as {string}")
    public void i_enter_the_username_as(String string) {
        test.loginPage.enterusername(string);
    }

    @When("I enter the password as {string}")
    public void i_enter_the_password_as(String pasword) {
        test.loginPage.enterpassword(pasword);
    }

    @When("I login to application using username {string} and password {string}")
    public void logintoapplication(String username, String password) {
        test.loginPage.loginToTheApplication(username, password);
    }


    @When("I click the Sign In Button")
    public void i_click_the_sign_in_button() {
        test.loginPage.clickonsigninbutton();
    }

    @Then("I should see the Sign In Error Message")
    public void i_should_see_the_sign_in_error_message() {
        Assert.assertEquals("Authentication failed.", test.loginPage.verifySignInErrorMessage());
    }

    @Then("I should see the success Message")
    public void i_should_see_the_success_message() {
        Assert.assertEquals("You logged into a secure area!\n×", test.loginPage.verifySignInErrorMessage());
    }

    @Then("I should see the message {string}")
    public void verifyFlashMessage(String message){
        Assert.assertEquals(message + "\n×", test.loginPage.verifySignInErrorMessage());
    }


    @After
    public void tearDown() {
        test.closeTestSession();
    }

}
