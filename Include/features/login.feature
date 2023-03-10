
Feature: Login
   As a registered user
  I want to log into my account
  So that I can access my personal data

    Scenario Outline: Log in with valid credentials
    Given that user is on the login page
    When user enters userName as '<userName>' and password as '<password>'
    Then user should be redirected to the Appointment Page
    And see in the Toggle Menu the options History Profile and Logout
    
    Examples:
      | userName   | password           |
      | John Doe   | ThisIsNotAPassword |
 


    
   
      
