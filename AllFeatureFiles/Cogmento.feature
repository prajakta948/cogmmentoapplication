@EndToEndTesting
Feature: Test Cogmento Application

  @LoginPage
  Scenario: Test Cogmento Login page
    Given User on Cogmneto Login Page
    When User Enter Username and Password and Click on Login

  @HomePage
  Scenario: Test Cogmento Home Page
    When User is on homepage and validates home page title
    And validate home page url
    And Validate home page logo

  @ContactPage
  Scenario: Test Contacts Page
    When user click on contact link
    And Verify user is on contact page
    Then Click on create button
    And Enter firtsname middlename and lastname email and status and social channels  and phone number
		And Click on Save button
		Then User delete created contact