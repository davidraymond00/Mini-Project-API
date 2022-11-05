@CreateACommentForProduct
Feature: Create A Comment For Product
  As a user
  I want create comment
  So i can manage my product

  Scenario: Create A Comment For Product with valid comment
    Given I set url comment
    When I request valid comment
    Then I stat code 401

  Scenario: Create A Comment For Product with invalid comment
    Given I set url comment
    When I request invalid comment
    Then I stat code 401