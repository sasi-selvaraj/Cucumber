
Feature: COM Test

  @company
  Scenario: HRM Management 
    Given User should navigate to the COMPANY Application
    And Admin enter company username  
    And Admin  enter company  password 
    And Admin accept button
    When Admin login
    
    Given User navigate the HRM system setup
    And User Create the company
    And User Create the Deprtment
    And User Create the Designation
    And User Create the Leave Type
    
    And User Create the Payslip Type
    And User Create the Allowance Option
    And User Create the Loan Option
    And User Create the Deduction Option
    And User Create the Goal Type
    And User Create the Training Type
    And User Create the Award Type
    And User Create the Termination Type
    And User Create the Job Category
    And User Creat the job stage
    And User Create the Performance Type
    And User Create the Competencies
    And User Create the Assets Product

    Given User should navigate to the Emplyee setup
    And User Create the Employee 
    And User Enter the Personal details
    And User Enter the Company details
    And User Enter the Bank Details
    And User Creat the Employeesetup
    
    Given User should navigate to the leave management 
    And User Click the Manage Leave 
     
   Given User navigate the payrollsetup
   And User click the set salary
   And User Click the Employee Salary
   And User Click the Allowance
   And User click the Commission
   And User click the Loan
   And User Click the Saturation Deduction
   And User Click the Other Payment
    
   Given User Should navigate the payslip
  
  Given User Should navigate the performance setup
  And User click the indicator
  And User click the Appraisal
  And User Click the goal tracking
  
  Given User naviagte the training setup
  And User create the trainer
  And User creat the Traininglist
  
  Given User Should navigate the Requirementsetup
  And User create the jobs
  And User create the job application 
  And user create the custom question
  
  Given User shuold navigate the HR admin setup
  And User Create the award
  And User Create the Transfer
  And User Create the Resignation
  And User Creat the trip
  And User Create the Promotion
  And User Create the Complaints
  And User Create the Working
  And User Create the Termination
  And User Create the Announcement

  
  Given User shuold navigate the companypolicy
  And User create the companypolicy
  And User create the assetsmanagement
  

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    