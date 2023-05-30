Feature: Validate this page

Scenario: Validate the example page


Given User is on the Practice page
When user select dropdown value
And  user enter the country name an select auto suggest name
And User select the option from dropdown menu
And User select the cheackbox
Then user close the page