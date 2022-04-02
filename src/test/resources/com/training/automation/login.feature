Feature: User Authentication

    As a user
    I want to be able to sign in
    So that I can access my account

  Scenario: User Signs In using Incorrect Username / Passwrord
    Given I am on the application Landing Page
    When I Navigate to the Sign In Page
    And I enter the username as "test"
    And I enter the password as "test"
    And I click the Sign In Button
    Then I should see the Sign In Error Message

