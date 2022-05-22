Feature: signup
  signup feature implementation for different users
  Scenario Outline: Login page default login
    Given User is on netbanking landing page
    When user login with "<login>" and "<pass>"
    Then Login page is populated
    And Following Credit Card info displayed is "True"
    Examples:
      | login | pass |
      | user1 | password1 |
      | user2 | password2 |
      | user3 | password3 |
      | user3 | password4 |