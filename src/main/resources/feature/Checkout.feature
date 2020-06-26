Feature: User_checkout_products
  Background:
    Given User is on homepage
    And A "Random" category is clicked
    And "Random" category page is displayed

  @Feature5 @Test1
  Scenario: Checkout with a new card
    When User selects product
    Then Pop-up is displayed
    When User clicks on Checkout button
    And Login page is displayed
    And User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    Then User is logged in
    And Shipping page is diplayed
    When User clicks on Courier radio button
    And User clicks on Proceed to payment button
    Then Payment page is displayed
    When User clicks on Credit or debit card via X-Payments DEMO radio button
    And User clicks on place order button
    Then Invoice page is displayed
    And User click on Logout button

  @feature5 @Test2
  Scenario: Checkout with a saved card

    When User selects product
    And Pop-up is displayed
    And User clicks on Checkout button
    Then User is logged in
    When User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    Then Shipping page is diplayed
    When User clicks on Local Shipping radio button
    And User clicks on Proceed to payment button
    Then Payment page is displayed
    When User clicks on used a saved card radio button
    And User clicks on place order button
    Then Invoice page is displayed
    And User click on Logout button

    @Feature5 @Test3
    Scenario: Checkout by cash

      When User selects product
      And Pop-up is displayed
      When User clicks on View cart button
      And User clicks on Go to checkout button
      And Login page is displayed
      When User enters "valid email" data in "email" field on "Log in" page
      And User enters "valid password" data in "password" field on "Log in" page
      And "Sign in" button is clicked
      Then Shipping page is diplayed
      When User clicks on local Pickup radio button
      And User clicks on Proceed to payment button
      Then Payment page is displayed
      When User clicks on Cash on delivery radio button
      And User clicks on place order button
      Then Invoice page is displayed
      And User click on Logout button

  @Feature5 @Test4
  Scenario: Checkout by cash local pickup shipping

    When User clicks on Login button
    Then "Pop up" is displayed
    And User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    When A "Random" category is clicked
    Then "Random" category page is displayed
    And User selects product
    And Pop-up is displayed
    When User clicks on View cart button
    And User clicks on Go to checkout button
    When User clicks on local Pickup radio button
    And User clicks on Proceed to payment button
    Then Payment page is displayed
    When User clicks on Cash on delivery radio button
    And User clicks on place order button
    Then Invoice page is displayed
    And User click on Logout button

  @Feature5 @Test5
  Scenario: Checkout with cash from My Account

    When User clicks on Login button
    Then "Pop up" is displayed
    And User enters "valid email" data in "email" field on "Log in" page
    And User enters "valid password" data in "password" field on "Log in" page
    And "Sign in" button is clicked
    When A "Random" category is clicked
    Then "Random" category page is displayed
    And User clicks on product
    And User add product to cart
    And Pop-up is displayed
    And User clicks on Checkout button
    And User clicks on local Pickup radio button
    And User clicks on Proceed to payment button
    And Payment page is displayed
    When User clicks on Cash on delivery radio button
    And User clicks on place order button
    Then Invoice page is displayed
    And User click on Logout button






