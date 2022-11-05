@GetProductComment
Feature: Get Product Comment
  As a user
  I want to get comment
  So i can manage my product

  Scenario: Get Product Comment with url
    Given I set url product comment
    When I request product comment
    Then I get stat code 404