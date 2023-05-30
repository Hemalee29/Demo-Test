
Feature: Cheack new tab and window open

Scenario: Validate the Tab is open or not


Given User is on the Home page
When User click on the Open window tab button
And New tab window open
Then Close the last tab

  
  
Scenario: Check the new tab is open or not


Given cheak User is on the Home page
When User click on the Open tab button
And New tab is open
Then Close the recent tab
  
  
  
Scenario: Validate the alert and confirm popup


Given cheak User is on the Home page
When User enter the name
And User click on the alert button
Then User click on the ok button 