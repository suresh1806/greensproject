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
Feature: To test add customer
  I want to use this template for my feature file

  @smoke1
  Scenario: To test Customer ID generation
  Given The user is in add customer page
  When The user fill in the customer details
  |Guru|prasad|test@gmail.com|chennai|741354|
  When The user clicks the submit button
  Then The user should see the customer ID generated

  @smoke2
  Scenario: To get alert message when user submit empty form
  Given The user in add customer page
  When The user are blank
  When The user clicked the submit button
  Then The user should see the error message
  
  @smoke3
  Scenario: To test form with invalid details 
  Given The user add customer page
  When The user fill in the customer details with invalid details
  |@12|p234|test@gmail|chennai|00000|
  When The user clicks on submit button
  Then The user should see the error
  
