
Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on the Sign in option
    And User enter email 'mhotak.us@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User click on Order section

  
  Scenario: Verify user can cancel the order
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    And A cancelation message should be displayed 'Your Order Has Been Cancelled'

  #@test
  #Scenario: Verify user can place order again
  #  And User click on buy again button
  # Then User click on Place Your order
  
  Scenario: Verify user can Return the order
    And User click on second order in list
    And User click on Return items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on return Order button
    Then A cancelation messages should be displayed 'Return was successfull'

  
  Scenario: Verify user can write a review on order placed
    And User click on first order in list
    And User click on Review button
    And User write Review headline
      | headline                | descripton         |
      | Kasa Outdoor Smart Plug | Less then standard |
    And User click Add your Review button
    Then A review message should be displayed 'Your review was added successfully'
