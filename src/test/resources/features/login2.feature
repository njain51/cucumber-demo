Feature: login
  login feature implementation for different users
  Scenario: Home page default login
    Given User is on netbanking landing page
    And he login with following details
    | Myra | myra123 |
    Then Home page is populated
    And Following Credit Card info displayed is "True"



  Scenario: Home page default login
    Given User is on netbanking landing page
    And he login with following details
      | Jia | jia123 |
    Then Home page is populated
    And Following Credit Card info displayed is "False"
