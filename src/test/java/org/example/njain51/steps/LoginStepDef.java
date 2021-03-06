package org.example.njain51.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 What this program snippet doing?
 **/
public class LoginStepDef {
    @Given("User is on netbanking landing page")
    public void userIsOnNetbankingLandingPage() {
        System.out.println("User is on netbanking page");
    }

   @And("he login with username {string} and password {string}")
    public void heLoginWithUsernameAndPassword(String arg0, String arg1) {
        System.out.println("User login with username " +arg0+ "and password " +arg1 );

    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("Home page is populated");
    }

    @And("Credit Card info displayed is {string}")
    public void creditCardInfoDisplayedIs(String arg0) {
        System.out.println("Credit Card info displayed is "+arg0);
    }


}
