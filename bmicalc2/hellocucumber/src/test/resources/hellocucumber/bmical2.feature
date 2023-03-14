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
Feature: abdominalobesity calculation
  As a Woman User
	I want to know if I have abdominal obsesity
	So that I can keep healthy

  @tag1
  Scenario: calculating abdominalobesity for possible values
    Given the user is a woman
    And her waistCircumference is <n>
    When i calculate abdominalobsesity
    Then the system returns for abdominalobsesity <value>
    
    Examples: 
    | n     | value | 
    | 100.5 | true  | 
    | 60.1  | false |
    

