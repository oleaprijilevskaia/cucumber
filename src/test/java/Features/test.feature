Feature: Edit Customer details

#   Scenario: Verify user can log in successfully with correct credentials
#
#    Given  Home page is displayed
#    When Clicks on My Account dropdown
#    And Clicks on Log in link
#    Then 'Log in' page is opened
#    When Enters valid Email Address and Password
#    And User presses [Login] button
#    Then 'My Account' page is opened
#
  Background:
    Given Home page is displayed

  Scenario: Verify user can log in successfully with correct credentials
#    Then Home page is displayed
    When User clicks on My Account dropdown
    And User clicks on Log in link
    Then Log in page is opened
    When User enters "sholmes@gmail.com" and "Holmes1234"
    And User presses Login button
    Then My Account page is opened
    When user logs out
    Then user clicks on Continue button

  Scenario Outline: Verify Log In with incorrect credentials
    When User clicks on My Account dropdown
    And User clicks on Log in link
    Then Log in page is opened
    When Enters  <emailAddress> and <password>
    And User presses Login button
    Then A warning validation message "Warning: No match for E-Mail Address and/or Password." or "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour."is displayed
    And user clicks on Home link

    Examples:
      | emailAddress      | password   |
      | test@mail.ru      | qazx12     |
      | test@test.com     | wes1       |
