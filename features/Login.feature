Feature: Login feature with leaftap application
@login
Scenario: login scenario with valid Credentials

Given setup the environment

And enter the username as 'demosalesmanager'

And enter the password as 'crmsfa'

When click on the login button

Then verify the login is success