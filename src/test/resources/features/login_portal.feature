@login-portal @regression

Feature: Webdriver University - Login Portal

  Background:
    Given I access the Webdriver University login portal page

    @smoke
  Scenario Outline: Validate Login
    Given I enter the username <username>
    When I enter the password <password>
    And I click on Login button
    Then I should be presented with a alert message <message>

    Examples:
      | username  | password     | message              |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | webdriver    | validation failed    |
      | joe_blogs | webdriver123 | validation failed    |