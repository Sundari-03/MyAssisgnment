Feature: CreateLead feature in leaftap application
Scenario Outline: create lead scenario with valid test data

Given setup the environment

And enter the username as 'demosalesmanager'

And enter the password as 'crmsfa'

When click on the login button    

Then verify the login is success
When click on the crmsfa link
And click on the leads tab
And click on the create lead link
Given enter the company name as <cname>
And enter the first name as <fname>
And enter the last name as <lname>
When click on the submit button
Then verify the leadId

Examples:
|cname|fname|lname|
|'Testleaf'|'Gokul'|'Sekar'|
|'Testleaf'|'Hari'|'R'|
|'TestLeaf'|'Babu'|'S'|

