@Register
Feature: Register
  As a user
  I want to create account
  So i can create new account

  Scenario: Register with null email null password null fullname
    Given I set url register
    When I input null email null password null fullname
    Then I will get email is required

  Scenario: Register with valid email null password null fullname
    Given I set url register
    When I input valid email null password null fullname
    Then I will get password is required

  Scenario: Register with null email valid password null fullname
    Given I set url register
    When I input null email valid password null password
    Then I will get email is required

  Scenario: Register with null email null password valid fullname
    Given I set url register
    When I input null email null password valid fullname
    Then I will get email is required

  Scenario: Register with valid email valid password null fullname
    Given I set url register
    When I input valid email valid password null fullname
    Then I will get fullname is required

  Scenario: Register with valid email null password valid fullname
    Given I set url register
    When I input valid email null password valid fullname
    Then I will get password is required

  Scenario: Register with null email valid password valid fullname
    Given I set url register
    When I input null email valid password valid fullname
    Then I will get email is required

  Scenario: Register with valid email valid password valid fullname
    Given I set url register
    When I input valid email valid password valid fullname
    Then I will get status code 400 Bad Request