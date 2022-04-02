Feature: User Authentication

    As a user
    I want to be able to sign in
    So that I can access my account

  Scenario: User Signs In using Correct credentials
    Given I am on the application Landing Page
    When I Navigate to the Sign In Page
    And I login to application using username "tomsmith" and password "SuperSecretPassword!"
    Then I should see the success Message


 Scenario: User Signs In using Incorrect Username 
    Given I am on the application Landing Page
    When I Navigate to the Sign In Page
    And I enter the username as "Invalid"
    And I click the Sign In Button
    Then I should see the message "Your username is invalid!"
