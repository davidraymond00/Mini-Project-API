@Index
Feature: Index
  As a user
  I want to see
  So i can see list hello

  Scenario: Get user index hello valid url
    Given I set url hello
    When I request get index hello
    Then I will get message 200

  Scenario: Get user index hello with invalid url
    Given I set invalid hello
    When I request get index hello
    Then I will get message 404