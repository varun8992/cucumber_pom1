Feature: Catalog features
Background:
 Given user is logged into login page
|username|password|
|demo|demo|
And user is on homepage
When user clicks catalog link
Then user moves to categories page

Scenario: Categories
Given user is on Categories page
Then title of Categories page should be "Categories"