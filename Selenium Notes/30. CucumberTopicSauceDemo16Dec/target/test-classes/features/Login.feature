Feature: login test

  Scenario Outline: verify login test
    Given user is on login page
    When user enter username "<username>" and password "<password>"
    And user click on login button
    Then user gets logged in and url is "https://www.saucedemo.com/inventory.html"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
