Feature: SearchFor

  Background:
    Given I navigate to Google
    Then I should be navigated to Google

    Scenario: Search for word
      Given I enter nothing
      When I press Search button
      Then I should see search results