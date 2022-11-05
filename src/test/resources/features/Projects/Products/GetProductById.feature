@GetProductById
Feature: Get product by id
  As a user
  I want to get product
  So i can manage my product

  Scenario: Get product with valid id
    Given I set url product
    When I request get product with valid id
    Then I get status code 200 ok

  Scenario: Get product with invalid id
    Given I set url product invalid id
    When I request get product with invalid id
    Then I get status code 404
    And I get error message record not found