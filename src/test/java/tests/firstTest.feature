Feature: First Test
Scenario Outline: First Test Scenario
Given I opened "<site>" on Chrome Browser
When Search edit box is displayed
Then I should be able to enter search criteria "<SearchCriteria>"

Examples:
|site	|SearchCriteria	|
|Google	|Hello Word		|
|Google	|Hey World		|

