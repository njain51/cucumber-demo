Feature: login
  login feature implementation for different users
  Scenario: Home page default login
    Given User is on netbanking landing page
    And he login with username "Myra" and password "myra123"
    Then Home page is populated
    And Credit Card info displayed is "True"


  Scenario: Home page default login
    Given User is on netbanking landing page
    And he login with username "Jia" and password "jia123"
    Then Home page is populated
    And Credit Card info displayed is "False"
