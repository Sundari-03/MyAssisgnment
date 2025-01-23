Feature: EditLead feature in Leaftaps Application


 @EditAccount@Account
Scenario Outline: Edit a lead scenario using valid data



When click on the Find-leads link
When click on phone tab
Given enter the phonenumber as <phno>
When click on Find Lead button
When click on First link
When click on Edit button
Given Update company name as <cname>
When click on Submit button
Then Verify the page 


Examples:
|cname|phno|
|'TestLeaf'|'99'|
|'Qeagle'|'98'|
|'TestLeaf'|'97'|