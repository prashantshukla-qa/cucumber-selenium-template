Feature: Belly Feature 2

  Scenario: a few cukes that failed new feature
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should fail

  Scenario: a few cukes that failed again new feature
    Given I have 42 cukes in my belly
    When I wait 2 hour
    Then my belly should be fail

  Scenario: a few cukes that pass again new feature
    Given I have 42 cukes in my belly
    When I wait 2 hour
    Then my belly should be happy
