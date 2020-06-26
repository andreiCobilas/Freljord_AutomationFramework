Feature: Increase product quantity, delete product from cart,

  Background:

    Given User is on homepage
    When A "Random" category is clicked
    Then "Random" category page is displayed

  @Feature4 @Tes12
  Scenario: Verify that user can delete a product from cart

    Given Random product is clicked
    Then Random product page is displayed
    And in stock amount is checked
    When Quantity field is populated with data that equals the maximum stock availability
    Then User clicks "add product to cart" from product page
    And "You have just added product" pop-up is displayed
    When "View cart" button is clicked
    Then Your Shopping Cart page is displayed
    When User clicks delete item from cart
    Then Item is deleted from cart

  @Feature4 @Tes13
  Scenario: Verify that user can change the number of items on cart page

    Given Random product is clicked
    Then Random product page is displayed
    And in stock amount is checked
    When Quantity field is populated with data that equals the maximum stock availability
    Then User clicks "add product to cart" from product page
    And "You have just added product" pop-up is displayed
    When "View cart" button is clicked
    Then Your Shopping Cart page is displayed
    When Changes the quantity of products to "1"
    Then Number of product is changed to "1"