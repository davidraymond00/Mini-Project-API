@GetAllProducts
Feature: Get all products
  As a user
  I want to get list of products
  So i can manage the products

  Scenario: Get all products
    Given I set url api get all products
    When I request list products
    Then I will get status code is 200
