@CreateANewProduct
Feature: Create a new product
  As a user
  I want to create new product
  So i can manage new product

  Scenario: Create a new product with valid body
    Given I set url create new product
    When I input valid body
    Then I get status code 200

  Scenario: Create a new product with invalid body
    Given I set url create new product
    When I input invalid body
    Then I get status codee 400
    And Get error message invalid character