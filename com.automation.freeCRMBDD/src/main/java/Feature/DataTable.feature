Feature: Demo DataTable

  Scenario: DataTable Implementation
    Given user is on Amazon Search Page
    When User Search for product
      | Lava     | 10000 |
      | Micromax |  5000 |
     
    Then list of phone displays
