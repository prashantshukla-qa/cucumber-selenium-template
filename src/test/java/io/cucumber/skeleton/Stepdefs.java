package io.cucumber.skeleton;

import static org.junit.Assert.assertTrue;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {

    Belly belly;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        System.out.println("I wait for " + int1 + " hours!");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        assertTrue("Test intentionally failed!!!", false);
    }

    @Then("my belly should be happy")
    public void my_belly_should_be_happy() {
        assertTrue("Test intentionally force passed!!!", true);
    }
}
