
Feature: Sign In Feature

  @test
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on the Sign in option
    And User enter email 'mhotak.us@gmail.com' and password "Tek@12345"
    And User click on login button
    Then User should be logged in into Account
   
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on the Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                      | password  |
      | mhotak.us@gmail.com | Tek@12345  |
     

  
  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on the Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                      | password | confirmpassword |
      | Ali | khanJikhan123456789@gmail.com | Tek@12345 | Tek@12345       |
    And User click on signUp button
    Then user should be logged in into Account
