Feature: Change Password

 
  Scenario: Verify User can Update password
    Given User is on retail website
    When User click on the Sign in option
    And User enter email 'mhotak.us@gmail.com' and password "Tek@12345"
    And User click on login button
    And User should be logged in into Account
    And User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@12345        | Tek@123456  | Tek@123456      |
    And User click on Change password button
    Then a Message should be displayed 'Password Updated Successfully'
