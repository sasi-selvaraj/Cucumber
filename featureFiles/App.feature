
Feature: ERP Application demo 
  @admin
  Scenario: Login to the Superadmin page
    Given User should navigate to the Application
    And User enter the username  
    And User enter the password 
    And User clik the accept button
    When User click the login button
     
  
    Given User should navigate the  Companies 
    And User click the Create icon 
    And User Enter the Name 
    And User Enter the Email 
    And User enable the login button 
    And User enter the new password
    When User click the creat button 
    
  
    Given User should navigate the plan
    And User click the Create icon
    And User Enter the Name in the field 
    And User Enter the price
    And User select the Duration 
    And User enter the maximum users 
    And User enter maximum customers 
    And User enter the maximum vendors
    And user enter the maximum clients
    And User enter the Storage limits 
    And User enter the Description
    When User click to the creat button 
    

 