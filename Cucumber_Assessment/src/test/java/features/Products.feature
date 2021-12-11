@Product
Feature: Adding Product

  Scenario Outline: Product Add to the cart
    Given User Opened Swag Lab Application
    When User Enters username "<UserName>"
    And User Enter Password "<Password>"
    And Clicks on Login Button
    And user adds the product to the cart "<product>"
    Then user can see the product added to the cart

    Examples: 
      | UserName      | Password     | product               |
      | standard_user | secret_sauce | Sauce Labs Bike Light |
