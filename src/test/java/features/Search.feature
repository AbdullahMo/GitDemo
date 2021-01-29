

Feature: Search Functionality

@SeleniumTest
Scenario: Search for item and validate results
Given User is on Greencart landing page
When User search for cucumber vegetables
Then Cucumber results are displayed

@SeleniumTest
Scenario: Search for item and then move to checkout page
Given User is on Greencart landing page
When User search for Brinjal vegetables
And Added item to cart
And User proceed to Checkout page for purchase
Then Verify selected Brinjal item is displayed in checkout pages

@SeleniumTest
Scenario Outline: Search for item and then move to checkout page with examples
Given User is on Greencart landing page
When User search for <Name> vegetables
And Added item to cart
And User proceed to Checkout page for purchase
Then Verify selected <Name> item is displayed in checkout pages


Examples:
|Name|
|Brinjal|
|Beetroot|
