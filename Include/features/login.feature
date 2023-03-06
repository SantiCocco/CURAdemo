
Feature: Login
  I want to login on CURA platform

  Scenario: login into the application with valid user
  	Given I want to manage my account
    When I send credentials to login
    Then I should be able to access to my account
   
      
