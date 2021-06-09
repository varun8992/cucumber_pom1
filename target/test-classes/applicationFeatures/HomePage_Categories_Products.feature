Feature: Product page features
Background:
Given user is logged into login page
|username|password|
|demo|demo|
And user is on homepage
When user clicks catalog link
And user clicks Products


Scenario: productpage title
Given user is on products page
Then the title of page should be "Products"

 