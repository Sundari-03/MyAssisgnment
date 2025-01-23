Feature:  edit feature in salesforce application
@salesforceedit
Scenario: edit details using valid test data

#Login to https://login.salesforce.com 
Given setup the salesforce environment 
And enter the salesforce username as 'dilip@testleaf.com'
And enter the salesforce password as 'Test@2025'
When click on login
When Click the App Launcher Icon  
And Select Accounts 
Given enter account name in search box as 'Sundari' 
When Click the dropdown icon next to the account
And Select Edit
And Set Type to Technology Partner 
And Set Industry to Healthcare 
Given Enter the Billing Address as 'Billing street1' 
And Enter the Shipping Address as 'Shipping street1'
When Set Customer Priority to Low
And Set SLA to Silver
When  Set Active to NO 
And Set Upsell Opportunity to No 
Given Enter the phone number  
And Click Save  
Then verify the phone number 