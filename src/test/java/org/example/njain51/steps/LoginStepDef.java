package org.example.njain51.steps; /**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/22/2022, Sunday
 **/

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
        System.out.println("User login with username " + arg0+ "and password " +arg1 );

    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("Home page is populated");
    }

    @And("Credit Card info is displayed")
    public void creditCardInfoIsDisplayed() {
        System.out.println("Credit Card info is displayed");
    }
}
