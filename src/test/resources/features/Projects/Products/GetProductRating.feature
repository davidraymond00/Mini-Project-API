@GetProductRating
Feature: Get Product Rating
  As a user
  I want to see rating
  So i can manage rating product

  Scenario: Get product rating with valid url
    Given I set url product rating with valid url
    When I request get product rating with valid url
    Then I get statu code 200
    And I get data

  Scenario: Get product rating with invalid url
    Given I set url product rating with invalid url
    When I request get product rating with invalid url
    Then I get statu code 200