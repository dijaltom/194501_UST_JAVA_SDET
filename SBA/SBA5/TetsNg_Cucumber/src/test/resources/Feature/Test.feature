Feature: Test

Scenario: Register functionality exists


When I open Register Page

Then Checking registeration without"password confirmation"

Then Submit button should exists

Scenario: Login functionality exists

When I open Login Page

Then Login with wrong password

Then Login button exists

