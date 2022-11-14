Feature: Menu bar automation

  Scenario: User can click on the menus
    Given user is on Market Data Page
    When they click on Market Data menu
    And they click on Market Access menu
    And they click on Trading Services menu
    And they click on Market Regulations menu
    And they click on Corporate menu

  Scenario: User can click on Market Data > Indices
    Given user is on Market Data Page
    When they click on Market Data menu
    And they click on Market Data menu item "Indices"
    Then user is on Indices page

  Scenario: User can click on Market Access > Become a Member
    Given user is on Market Data Page
    When they click on Market Access menu
    And they click on Market Access menu item "Become a member"
    Then user is on Become a member page

  Scenario: User can click on Market Access > Exchange Members
    Given user is on Market Data Page
    When they click on Market Access menu
    And they click on Market Access menu item "Exchange Members"
    Then user is on Exchange Members page

