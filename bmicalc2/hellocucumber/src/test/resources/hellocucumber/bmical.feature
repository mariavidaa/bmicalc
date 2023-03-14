#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: bmi calculation
  As a user 
  I want to compute the bmi of a given mass and height 
  So that I can know the result

  @tag1
  Scenario: calculating the bmi for possible mass and height
    Given I have a bmi calculator
    And mass is <m>
    And height is <h>
    When i calculate bmi for possible mass and height
    Then the system returns <value>
    
    Examples:
    | m    |  h   | value  |
    | 65.0 | 1.70 | 22.0   |
    | 54.0 | 1.64 | 20.0   |


  @tag2
  Scenario Outline: calculating the bmi for impossible mass or height
    Given I have a bmi calculator
    And mass is <m>
    And height is <h>
    When i calculate bmi for impossible mass or height
    Then the system raises an exception

    Examples: 
    | m    |  h   | 
    | 0    | 1.70 | 
    | 54.0 | 0    |
    | -1   | 1.64 | 
    | 60.0 | -1   |
    

