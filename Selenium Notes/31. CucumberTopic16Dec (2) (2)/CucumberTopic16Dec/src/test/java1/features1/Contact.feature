Feature: contact tests

  Scenario Outline: verify contact functionality
    Given user launch the browser
    When user navigate on the contact page
    And user enter email "<email>" and name "<name>" and message "<message>"
    And user clicked on send message
    Then user get message on contact as "Thanks for the message!!"

    Examples: 
      | email            | name   | message |
      | david1@gmail.com | david1 | hi      |
      | david2@gmail.com | david2 | hii     |
      | david3@gmail.com | david3 | hiii    |
      | david4@gmail.com | david4 | hiiii   |
