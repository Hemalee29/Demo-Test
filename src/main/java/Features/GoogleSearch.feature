Feature: Google search

Scenario: Validate Google search is working

Given Browser is open
And User is on goolge search page
When user enter a test in search box
And hit enter
Then user navigate to search result