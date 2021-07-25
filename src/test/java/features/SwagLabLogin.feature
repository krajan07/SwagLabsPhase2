Feature: Login Swaglabs
  Description: This feature is for login Swaglabs

  @Login
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the Swaglabs application
    When User provides usernmae "<Username>"
    And User provides  password "<Password>"
    And User clicks on Login button
    Then User should be logged in successfully

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |

  @Login
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the Swaglabs application
    When User provides usernmae "<Username>"
    And User provides  password "<Password>"
    And User clicks on Login button
    Then User should get error message "<Error>"

    Examples: 
      | Username       | Password      | Error                                                                     |
      | standard_users | secret_sauces | Epic sadface: Username and password do not match any user in this service |
