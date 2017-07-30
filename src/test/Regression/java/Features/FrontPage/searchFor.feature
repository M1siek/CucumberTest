Feature: SearchFor

  Background:
    Given I navigate to Google
    Then I should see Google

    Scenario: Search for "word"
      Given I enter "nothing"
      When I press Search button
      Then I should se search results