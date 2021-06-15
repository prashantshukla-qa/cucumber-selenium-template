Feature: Belly

  Scenario: a few cukes that fail
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

Scenario: a few cukes that pass
    Given I have 42 cukes in my belly
    When I wait 2 hour
    Then my belly should be happy
