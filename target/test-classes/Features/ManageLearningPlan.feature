#Author: Sabitha M

@smoke
Feature: Manage Learn Plans

  Scenario: Validate the Login functionality with company admin user
    Given GL application should open in chrome browser
    When Enter company admin username and password in login page
    And click on signin button
    Then validate the gl home page after successfull login
    
   Scenario: Validate the Blank Course Creation
    When Click on Course Management and course management page should be open
    And Click on Add course button and Create a course popup should be open
    And Select the course type and click on Next button and create a course page should be open
    And Enter the course fullname and course short name 
    And Select the Course type and Due date and Issue Certificate
    And Select the Course catolog and click on save button
    And Validate the Course created popup and Course created Success message.
    Then Click on view course button and validate the Course page 

   Scenario: Validate the Add an activity to the course.
    When Click on turn editing on button and select the Add An Activity or Resource from Add activity dropdown
    And Validate the Add An Activity or Resource popup and click on File Activity
    And Enter the File name and click on Upload document icon
    And Validate the File Picker popup and click on Recent files 
    And Click on document name and click on select this file button
    Then Click on save and Return to course button and validate the File activity in course page
   
   Scenario: Validate the Create A Learning Plan Popup
    When Click on Company Dashboard and Company Dashboard page should be open
    And Validate the Company Dashboard Page and Click on Manage Learning Plans from Training Management
    And Validate the Manage Learning Plans Page and Click on Add Learning Plan button
    Then Validate the Create A Learning Plan Popup after clicking on Add Learning Plan button 
    
   Scenario: Validate the Learning Plan was created Successfully
    When Enter the Learning Plan full name and Short name
    And choose the Status and click Issue certificate is on
    And enter Learning Plan ID Number and Training area and credits and lp code
    And select the lp picture and click save button
    Then Validate the Learning Plan was created Successfully message appears
    
   Scenario: Validate the Update Successfully message for Step1
    When search and click on manage learning plan
    And click Add Step button and enter Title
    And click on Map Course button and search course in Map Course popup
    And select the Course and click on Add button
    And click on submit and click on confirm in popup 
    And Validate the Course mapped Successfully message appears and Close the popup
    And click on required and save button 
    Then Validate the Update Successfully message for Step1
    
   Scenario: Map learner to the Learning plan
    When click on Manage Learning Plans in bread crumbs
    And search and click on checkbox nearby the learning plan
    And click on Map learner button and search learner in Map Learner popup
    And select the learner and click on Add button
    And click on submit button and click on confirm in popup
    And Validate the learner mapped Successfully message appears and Close the popup
    Then Validate the User presented in Users Column
    
  