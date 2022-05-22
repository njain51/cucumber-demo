package org.example.njain51.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 What this program snippet doing?
 **/
public class Login3StepDef {
    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }

    @Then("Login page is populated")
    public void loginPageIsPopulated() {
        System.out.println("Login page is populated");
    }
}
