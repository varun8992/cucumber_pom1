Feature: login page feature

Scenario: login page title
Given user is on login page
When user gets title of the page
Then title of page should be "Administration"


Scenario: login page Forgetten Password
Given user is on login page
Then forgot password link should be displayed

@smoke
Scenario: login with correct credentials 
Given user is on login page
When user enter username "demo" 
And user enter password "demo"
And user clicks button 
Then user gets title of the page
And title of page should be "Dashboard"


