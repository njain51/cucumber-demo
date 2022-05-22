package org.example.njain51.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

/**
 What this program snippet doing?
 **/
public class Login2StepDef {
    @And("he login with following details")
    public void heLoginWithFollowingDetails(DataTable data) {
        List<List<String>> obj = data.asLists();
        String username = obj.get(0).get(0);
        String password = obj.get(0).get(1);
        System.out.println("User login with username " +username+ " and password " +password );
    }

    @And("Following Credit Card info displayed is {string}")
    public void followingCreditCardInfoDisplayedIs(String arg0) {

        System.out.println("Following Credit Card info displayed is " +arg0);
    }


}
