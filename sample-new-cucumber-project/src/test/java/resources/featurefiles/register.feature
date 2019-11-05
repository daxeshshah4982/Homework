Feature: Nop Commerce Demo Registration
  As a user I want to do registration on nop commerce demo application

#  @Regression
  Scenario Outline: User should register successfully with valid data
    Given I am on homepage
    When I click on register link
    And I reached at registration page
    And I click on female gender
    And enter first name in "<first_name>" field
    And enter last name into "<last_name>" field
    And select day 29 from dropdown list of Date of birth
    And pick month February from dropdown list of Date of birth
    And pick Year 1965 from dropdown list of Date of birth
    And enter email in "<email>" field
    And enter company name in "<company>" field
    And un click on newsletter tab
    And enter password in "<password>" field
    And enter confirmed password in "<confirmed_password>" field
    And enter on Register button
    Then I should register successfully on demo nop commerce web application
    Examples:
      | first_name | last_name | email                       | company         | password | confirmed_password |
      | jennifer   | aniston   | jeniferaniston123@gmail.com | jennifer studio | abc123   | abc123             |
#      | courtney   | cox       | courtneycox456@hotmail.co.uk | courtney cooks  | cde456   | cde456             |
#      | lisa       | kudro     | lisakudro789@yahoo.com       | lisa parlours   | lmn789   | lmn789             |

  @Regression
  Scenario Outline: User should not register with invalid data in mandatory field
    Given I am on homepage
    When I click on register link
    And I reached at registration page
    When I click on female gender
    And enter first name in "<first_name>" field
    And enter last name into "<last_name>" field
    And select day 29 from dropdown list of Date of birth
    And pick month February from dropdown list of Date of birth
    And pick Year 1965 from dropdown list of Date of birth
    And enter email in "<email>" field
    And enter company name in "<company>" field
    And un click on newsletter tab
    And enter password in "<password>" field
    And enter confirmed password in "<confirmed_password>" field
    And enter on Register button
    Then I should not register successfully on demo nop commerce web application
    Examples:
      | first_name | last_name | email                        | company          | password | confirmed_password |
      | jennifer   |           | jeniferaniston123@gmail.com  | jennifer studio  | abc123   | abc123             |
      |            | cox       | courtneycox456@hotmail.co.uk | courtney cooks   | cde456   | cde456             |
      | lisa       | kudro     | lisakudro789@yahoo.com       | lisa parlours    |          | lmn789             |
      | cobie      | smulders  | smuldercobie                 | licence telecast | 456cobie | 456cobie           |
      | alyson     | hannigan  | allison856@gmail.com         | alyson ltd.      | 856aly   | 856alyson          |
      | sarah      | chalke    | sarah562@yahoo.co.uk         | sarah visions    | sarah569 |                    |


