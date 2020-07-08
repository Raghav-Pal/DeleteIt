@smoke
Feature: Validate login functionality

	@reg
  Scenario: Check login with valid credentials
    Given user is on login page demo
    When user adds username and password
    And click on login butoon
    Then user is navigated to the home page
