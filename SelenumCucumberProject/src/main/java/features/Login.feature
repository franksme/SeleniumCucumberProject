@featureTest
Feature: Bank App launching feature

  
  Scenario Outline: User login Test Scenario
    Given User opens Login Page
    When User enters valid username and password
    And User clicks on Login Button
    Then User is on Home Page

  