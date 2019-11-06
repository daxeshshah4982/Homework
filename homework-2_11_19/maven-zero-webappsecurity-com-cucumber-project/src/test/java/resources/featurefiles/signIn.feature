Feature: Sign In functionality
  As a user I want to check sign In functionality

  @Sanity
  Scenario Outline: User should not login with invalid data
    Given I am on home page
    When I click on sign in link
    And I reached at SignIn page
    And I enter email in into "<login>" field
    And enter password in into "<password>" field
    And click on sign in button
    Then I should not sign in into application
    Examples:
      | login              | password  |
      | abc123@gmail.com   | abc456    |
      |                    | 466dkajfk |
      | chdk4789@yahoo.com |           |
      |                    |           |
