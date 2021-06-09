Feature: Homepage features
Background:
Given user is logged into login page
|username|password|
|demo|demo|

Scenario: homepage title
Given user is on homepage
Then the title of page should be "Dashboard"

Scenario: homepage menu list
Given user is on homepage
Then user gets the menu list
|Dashboard|
|Catalog|
|Extensions|
|Design|
|Sales|
|Customers|
|Marketing|
|System|
|Reports|

Scenario: homepage Catalog list
Given user is on homepage
When user clicks catalog link
Then user gets list
|Categories|
|Products|
|Recurring Profiles|
|Filters|
|Attributes|
||
||
|Options|
|Manufacturers|
|Downloads|
|Reviews|
|Information|

Scenario: homepage catalog categories list
Given user is on homepage
When user clicks catalog link
Then user gets list
|Categories|
|Products|
|Recurring Profiles|
|Filters|
|Attributes|
||
||
|Options|
|Manufacturers|
|Downloads|
|Reviews|
|Information|
And user clicks Categories
Then the title of page should be "Categories"

Scenario:homepage catalog products list
Given user is on homepage
When user clicks catalog link
Then user gets list
|Categories|
|Products|
|Recurring Profiles|
|Filters|
|Attributes|
||
||
|Options|
|Manufacturers|
|Downloads|
|Reviews|
|Information|
And user clicks Products
Then the title of page should be "Products"


Scenario: homepage feature
Given user is on homepage
When user clicks logout button
When user gets title of the page
Then title of page should be "Administration"

