Feature: Add product to cart
  Description: This feature is for adding product to cart
	
  Background: 
    Given User has opened the Swaglabs application
    When User provides usernmae "standard_user"
    And User provides  password "secret_sauce"
    And User clicks on Login button
    Then User should be logged in successfully
    
	@Product
  Scenario Outline: Verify that user is able to add single product
    When User selects adds Sauce Labs Backpack to cart
    Then Item must be added successfully
    
	@Product
  Scenario: Verify that user is able to multiple single product
    When User selects products to add
      | Field    | XPath                                           |
      | Product1 | //*[@id="add-to-cart-sauce-labs-bike-light"]    |
      | Product2 | //*[@id="add-to-cart-sauce-labs-fleece-jacket"] |
    Then Items must be added successfully
