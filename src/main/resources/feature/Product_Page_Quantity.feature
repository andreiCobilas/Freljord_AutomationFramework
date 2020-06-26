Feature: Us002 Product page, quantity in stock.

Background:
  Given User is on homepage
  When A "Random" category is clicked
  Then "Random" category page is displayed

  @Test9 @Feature3
  Scenario: Verify that user can add product to shopping cart that equals the maximum available stock

    Given Random product is clicked
    Then Random product page is displayed
    And in stock amount is checked
    When Quantity field is populated with data that equals the maximum stock availability
    Then User clicks "add product to cart" from product page
    And "You have just added product" pop-up is displayed

  @Test10 @Feature3
  Scenario: Verify that user can't add product to shopping cart, with value that is greater the available stock

    Given Random product is clicked
    Then Random product page is displayed
    And in stock amount is checked
    When Quantity field is populated with data that exceed the stock availability
    Then User can't add product to the cart

  @Tes11 @Feature3
  Scenario:  Verify that user can't add product to shopping cart with invalid characters in quantity field

    Given Random product is clicked
    Then Random product page is displayed
    When Quantity field is populated with "invalid input"
    Then User can't add product to the cart

