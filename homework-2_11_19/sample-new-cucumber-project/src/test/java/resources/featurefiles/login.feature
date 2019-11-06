Feature: Nop commerce Demo Login Feature
  As a user I want to login into nope commerce website

  @Sanity
  Scenario: User should login successfully
    Given I am on homepage
    When I click on LoginLink
    And I enter email address "abc123@gmail.com" into email field
    And I enter password "abc123" into password field
    And I click on login button
    Then I should successfully login to my account

  Scenario Outline: User should not login with invalid credentials
    Given I am on homepage
    When I click on LoginLink
    And I enter email address "<email>" into email field
    And I enter password "<password>" into password field
    And I click on login button
    Then I should not login to my account
    Examples:
      | email             | password |
      | abc1234@gmail.com | abc123   |
      | abc234@gmail.com  | 132abc   |
      | dax1234@yahoo.com | 1245dax  |
      |                   | 1234xyz  |
      | dax1245@gmail.com |          |
      |                   |          |
