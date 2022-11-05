@CreateACategory
Feature: Create A Category
  As a user
  I want create category
  So i can manage my product

  Scenario: Create A Category with valid name and description
    Given I set url create a category
    When I request create a category with valid name and description
    Then I gett status code 200

  Scenario: Create A Category with null name
    Given I set url create a category
    When I request create a category with null name
    Then I gett status code 500
    And I gett error message

  Scenario: Create A Category with null name and null description
    Given I set url create a category
    When I request create a category with null name description
    Then I gett status code 500
    And I gett error message