Feature: Demo nop commerce homepage feature
  As a user I want to check all categories on homepage


  Scenario Outline: User should click on all categories
    Given I am on homepage
    When I click on "<category>"
    Then it should show dropdown list of "<category>"
    Examples:
      | category          | category          |
      | Computer          | Computer          |
      | Electronics       | Electronics       |
      | Apparel           | Apparel           |
      | Digital Downloads | Digital Downloads |
      | Books             | Books             |
      | Jewelry           | Jewelry           |
      | Gift cards        | Gift cards        |