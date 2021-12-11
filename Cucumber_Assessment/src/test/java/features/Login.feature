@LoginFeature
Feature: Login Test Feature

  Scenario Outline: Possitive Login Test
    Given User Opened Swag Lab Application
    When User Enters username "<Username>"
    And User Enter Password "<Password>"
    And Clicks on Login Button
    Then User Should be on the Products Page

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |

  Scenario Outline: Negative Login Test
    Given User Opened Swag Lab Application
    When User Enters username "<UserName>"
    And User Enter Password "<Password>"
    And Clicks on Login Button
    Then User Should get the "<Error>"

    Examples: 
      | Username      | Password       | Error                                                                     |
      | standard_user | secret_sauce12 | Epic sadface: Username and password do not match any user in this service |
