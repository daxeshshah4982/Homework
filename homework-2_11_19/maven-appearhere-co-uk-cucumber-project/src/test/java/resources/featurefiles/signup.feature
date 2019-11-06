Feature: Signup functionality
  As a user I want to signup with email

  Scenario: User should be able to sign up successfully
    Given I am on homepage
    When I click on signup link
    And I click on signup with email
    And I enter "Jennifer" into the firstname field
    And I enter "Anniston" into the lastname field
    And I enter "jenniferanniston@yahoo.com" into the email field
    And I enter "Abcd12345" into the password field
    And I enter on signup button
    Then I should able to sign up successfylly and I should see dashboard


