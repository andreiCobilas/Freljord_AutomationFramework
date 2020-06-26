Feature: Login functionality

  Background:
    Given User is on homepage

  @Positive @Test1 @Feature1
  Scenario: Verify the logging in with valid credentials

    When User clicks on Login button
    Then "Pop up" is displayed
    When User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    Then User is logged in

  @Positive @Test2 @Feature1
  Scenario: Verify the logging in clicking on menu button on the top right

    When User clicks on the preferences menu button after scroll
    Then "Preferences menu" is expanded
    When User clicks on "Sign in" button from preferences menu
    Then "Pop up" is displayed
    When User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    Then User is logged in

  @Positive @Test3 @Feature1
  Scenario: Verify the logging in  with valid data after clicking on checkout button

    When User clicks on add "product"
    Then "Pop up" with "Checkout" button is displayed
    When "Checkout" button is clicked by user
    Then "Log in" form is displayed
    When User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And  "Sign in" button is clicked
    Then  User is logged in

  @Negative @Test4 @Feature1
  Scenario: Verify the logging in with un-existent user is not possible

    When User clicks on Login button
    Then "Pop up" is displayed
    When User enters "invalid email" data in "email" field on "Log in" page
    And User enters "invalid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    Then the error message is displayed








