@DeleteAProduct
Feature: Delete a product
  As a user
  I can delete my product
  So i can manage my product

  Scenario: Delete a product with valid id
    Given I set valid url delete a product
    When I request delete a product
    Then I get 200 okk
    And I get see my product

  Scenario: Delete a product with invalid id
    Given I set invalid url delete a product
    When I request invalid delete a product
    Then I get status code 500
    And I get error message where condition
