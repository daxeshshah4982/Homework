Feature: login functionality
  As a user I want to check login functionality on orange nop commerce web application

  Scenario: As a user I should log in Successfully with valid data
    Given I am on homepage
    When I enter "Admin" into username field
    And I enter "admin123" into the password field
    And I click on login button
    Then I should login successfully
