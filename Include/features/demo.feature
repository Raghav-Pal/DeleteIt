Feature: Test login functionality

  @smoke
  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then check this message on the screen

  @reg
  Scenario Outline: Check login with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then check this <message> on the screen

    @valid
    Examples: 
      | username | password | message   |
      | admin    | admin123 | Dashboard |
      | admin    | admin123 | Dashboard |

    @invalid
    Examples: 
      | username | password | message             |
      | user11   | pass11   | Invalid Credentials |
      | user22   | pass22   | Invalid Credentials |
