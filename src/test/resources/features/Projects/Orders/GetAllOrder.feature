@GetAllOrder
Feature: Get All Order
  As a user
  I want to see order
  So i can see list order

  Scenario: Get all order with valid token
    Given I set url get all order
    When I request get all order
    Then I will get status 401