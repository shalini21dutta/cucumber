Feature: Adobe Login

  Scenario: Non-existing user account
    Given I am able to navigate onto the home page
    And I click on signin link
    When I update the email as "test@gmail.com"
    And I click on continue button
    Then I shoud see the error message as "We couldn't find an account with the email address.\n Find your account or create a new account"

  Scenario Outline: Non-existing user account
    Given I am able to navigate onto the home page
    And I click on signin link
    When I update the email as "<email>"
    And I click on continue button
    Then I shoud see the error message as "We couldn't find an account with the email address.\n Find your account or create a new account"

    Examples: 
      | email              | error                  |
      | shalini@gmail.com  | Account does not exist |
      | test@gmail.com     | Account does not exist |
      | facebook@gmail.com | Account does not exist |
