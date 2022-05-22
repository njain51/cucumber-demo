/**
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
public class MyStepdefs {
    @Given("I have <opening balance> beer cans")
    public void iHaveOpeningBalanceBeerCans() {
        System.out.println("I have Opening Balance");
    }

    @And("I have drunk processed beer cans")
    public void iHaveDrunkProcessedBeerCans() {
    }

    @When("I go to my fridge")
    public void iGoToMyFridge() {
        System.out.println("I go to my Fridge");

    }

    @Then("I should have <in stock> beer cans")
    public void iShouldHaveInStockBeetCans() {
        System.out.println("I should have in stock beer cans");
    }


}
