Feature: Belly

  Scenario: a few cukes that fixed
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: a few cukes that pass
    Given I have 42 cukes in my belly
    When I wait 2 hour
    Then my belly should be happy

  Scenario: a few cukes that pass again
    Given I have 42 cukes in my belly
    When I wait 2 hour
    Then my belly should be happy
