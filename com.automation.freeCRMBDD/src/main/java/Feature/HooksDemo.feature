Feature: Demo Cucumber Hooks

  @Smoke
  Scenario: Amazon Search Page
    Given user is on Amazon Search Page
    Then list of phone displays

  @Regression
  Scenario: Amazon Search Lava Smartphone
    Given user is on Amazon Search Page
    When user search for "Lava Smartphone"
    Then list of phone displays

  @Regression
  Scenario: Amazon Search Micromax Smartphone
    Given user is on Amazon Search Page
    When user search for "Micromax Smartphone"
    Then list of phone displays
