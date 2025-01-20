Feature: create account in salesforce application
@Salesforce
Scenario: creat account with valid test data

Given setup the salesforce environment 
And enter the salesforce username as 'dilip@testleaf.com'
And enter the salesforce password as 'Test@2025'     
When click on login  
When Click on toggle menu 
And Click view All  
And click Sales from App Launcher 
And Click on Accounts tab  
And Click on New button 
Given Enter the account name as 'Sundari' 
When Select Ownership as Public                                         
And Click save  
Then verify Account name  



