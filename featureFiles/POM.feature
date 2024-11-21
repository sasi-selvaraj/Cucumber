
Feature: Pom TEST

  @projectmanager
  Scenario: Project management 
    Given User should navigate to the ERP POM Application
    And Admin enter  username  
    And Admin  enter  password 
    And Admin clik  accept button
    When Admin  click login button
     
     
    Given User should navigate the Dashboard 
    And User click Clock in button
    And User enable the Work from home button 
    And User Click the Clock in button 
    And User Click the  Clock out button 
     
    Given User should navigate the HRM system
    And User Click Leave management Setup
    And User  Click Manage Leave Option
    And User Click the Create leave icon
    And User Select the Employee 
    And User Select the Leave Type
    And User Enter the Start date resjdcsjp9o00eds
    And User Enter the End Date
    And User Enter the Leave reason
    And User Enter the Remark
    When User Click the Create leave
    
    And User click the Leave Action icon
    And User Click the Approval button
    And User click the Leave Action 
    And User Click the Reject button
    
       
    Given User should navigate the Project System
    And User click the Project
    And User Click the Create new Project Icon
    And User Enter The Project Name
    And User Enter the Start Date
    And User Enter the End Date 
    And User Upload The Project image 
    And User Select the Client 
    And User Enter the User
    And User Enter the Project Manager
    And User Enter the Budget
    And User Enter the Estimated Hours 
    And User Select the Status 
    When user Click the Create Project
     
    Given User should navigate the milestone
    And User clickthe milestone
    And User enter the title
    And User enter the Status
    And User enter start date and end date
    And User enter the percentage 
    And user enter the cost 
    And User enter the Vendor
    When User creat milestone
    
   
    And User click  Project
    Given User Create the Task
    And User Click the Task button
    And User Click the To Do Task button
    And User Enter the Taskname 
    And User Select Milestone 
    And User Enter Estimate Hours 
    And User TasK Memeber Add
    When User Create the To Do Tasks
    
  
    And User navigate Project 
    Given User navigate bugreport
    And User Click the Bug report
    And User Click the Bug Create button
    And User Enter the title 
    And User Enter startdate and end date
    And User Enter Bug status
    And User Enter Assigned To
    When User Create Bugreport
    
    Given User should navigate the task calender
    And User click the Project
  
     
    Given Navigate the Project System Setup
    And User Click Project Task stage 
    And User Click the task Create icon
    And User Enter the Project task Stage
    And User Enter the Color
    When User Create the  Project Task Stage
    
                     
    And User Click Bug Status
    And User Click the Bug stage Create icon
    And User Enter the Bug Stage title
    When User Create the Bug Stage                                                                                  
     
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
