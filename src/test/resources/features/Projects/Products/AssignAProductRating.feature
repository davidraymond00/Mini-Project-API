@AssignAProductRating
Feature: Assign A Product Rating
  As a user
  I want create rating
  So i can create rating product

  Scenario: Assign A Product Rating with valid url
    Given I set valid url rating
    When I request product rating
    Then I get status codee 401

  Scenario: Assign A Product Rating with invalid url
    Given I set invalid url rating
    When I request invalid product rating
    Then I get status codee 401
    And I get error messagee record not found