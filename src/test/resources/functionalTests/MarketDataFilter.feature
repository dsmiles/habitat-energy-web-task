Feature: Automated Web UI Tests

  Scenario: Map data updates when Continuous filter selected
    Given user is on Market Data Page
    When they click on Continuous button
    Then map values have changed

  Scenario: Map data updates when Continuous filter selected
    Given user is on Market Data Page
    When they click on Continuous button
    Then map values have changed

  Scenario: Map data updates when Capacity filter selected
    Given user is on Market Data Page
    When they click on Capacity button
    Then map values have changed

  Scenario: Map data updates when Intraday filter selected
    Given user is on Market Data Page
    When they click on Intraday button
    Then map values have changed

  Scenario: Map data updates when 30 min filter selected
    Given user is on Market Data Page
    When they click on 30 min button
    Then map values have changed

  Scenario: Map data updates when timeline filter 01 selected
    Given user is on Market Data Page
    When they click on timeline filter "01"
    Then map values have changed

  Scenario: Map data updates when timeline filter 02 selected
    Given user is on Market Data Page
    When they click on timeline filter "02"
    Then map values have changed

  Scenario: Map data updates when timeline filter selected
    Given user is on Market Data Page
    When they click on timeline filter "01"
    And they click on timeline filter "03"
    And they click on timeline filter "05"
    Then map values have changed

  Scenario: User can reset filters on page
    Given user is on Market Data Page
    And they click on Continuous button
    When they click on reset filters
    And the filters are cleared
