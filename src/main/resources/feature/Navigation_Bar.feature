Feature: Verify the functionality, of navigation bar on site

  Background:
    Given User is on homepage

    @Feature5 @Tes14
    Scenario: Verify the functionality, of navigation bar on multiple pages of the site
      When User Clicks "Shipping" on Navigation Bar
      Then "Shipping" page is opened
      When User Clicks "New!" on Navigation Bar
      Then "New arrivals" page is opened
      When User Clicks "Coming soon" on Navigation Bar
      Then "Coming soon" page is opened
      When User Clicks "Contact us" on Navigation Bar
      Then "Contact us" page is opened
      When User Clicks "Home" on Navigation Bar
      Then "Catalog" page is opened