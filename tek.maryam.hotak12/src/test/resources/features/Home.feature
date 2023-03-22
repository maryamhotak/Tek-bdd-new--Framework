 
Feature: Retail Home Page

  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then User below options are present in Shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify Department sidebar option
    Given User is on retail website
    When User click on All section
    And User is on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo               |
      | Electronics | TV & Video                     | Video Game              |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets       |
      | Sports      | Athletic Clothing              | Exercise & Fitness      |
      | Automative  | Automative Parts & Accessories | MotoCycle & Powersports |
  
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on the Sign in option
    And User enter email 'mhotak.us@gmail.com' and password 'Tek@12345'
    And User click on login button
    When User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress | apt | city  | state | zipCode |
      | America | Elon Musk    |  9729003004 | 123 Thorne Dr   | 123 | Allen | Allen |   75002 |
    And User click Add your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1256876523459801 | Ghulam Sakhi        |              11 |           2027 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then Message should be Displayed 'Order Placed, Thanks'

  
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on the Sign in option
    And User enter email 'mhotak.us@gmail.com' and password 'Tek@12345'
    And User click on login button
    When User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on the Item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then Message should be Displayed 'Order Placed, Thanks'

  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on the Sign in option
    And User enter email 'mhotak.us@gmail.com' and password 'Tek@12345'
    And User click on login button
    When User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
