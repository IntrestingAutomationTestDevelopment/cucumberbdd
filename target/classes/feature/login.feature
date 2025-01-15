Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter an invalid username or password
    And I click on the login button
    Then I should see an error message
