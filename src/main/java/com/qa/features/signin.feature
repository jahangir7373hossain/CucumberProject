
@ExtentReport
Feature: Sign in page

  Scenario Outline: Test sign in page
    Given User open the app
    Then User valiadte all sign in property there
    Then User insert "<username>" and "<password>"
    And close the browser

    Examples: 
      | username          | password |
      | jahangir123       |   123547 |
      | hossain@gmail.com |  3595158 |
      | bchchshshcbds     |  6303633 |
