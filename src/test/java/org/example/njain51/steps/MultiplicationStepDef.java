package org.example.njain51.steps; /**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 5/22/2022, Sunday
 **/

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 What this program snippet doing?
 **/
public class MultiplicationStepDef {
    @Given("I have variable a")
    public void iHaveVariableA() {
        System.out.println("I have variable a");
    }

    @And("I have variable b")
    public void iHaveVariableB() {
        System.out.println("I have variable b");
    }

    @When("I multiply a and b")
    public void iMultiplyAAndB() {
        System.out.println("I Multiply a and b");
    }


    @Then("I display the Result")
    public void iDispayTheResult() {
        System.out.println("I Display the result");
    }
}
