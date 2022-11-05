@GetUserInformation
Feature: Get User Information
  As a user
  I want view user
  So i can view detail user

  Scenario: Get user information with valid url
    Given I set valid url
    When I request get user information
    Then I will get message 401


