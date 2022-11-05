@CreateNewOrder
Feature: Create a new order
  As a user
  I create new order
  So i can manage new order

  Scenario: Create new order with valid token
    Given I set url order and valid token to create order
    When I request with valid email
    Then I will get 400 ok