Feature: OrangeHRM Login Functionality

  Scenario: Verify valid login

    Given user launches browser
    When user opens OrangeHRM application
    And user enters valid username and password
    And clicks on login button
    Then user should navigate to dashboard