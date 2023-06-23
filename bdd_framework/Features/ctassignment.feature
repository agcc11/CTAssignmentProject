Feature: PGS functionality

Background: open PGS
Given open the edge browser
When user open the url "https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx"
Then user click on Tools icon
Then user click on PGS icon
Then switch focus from main to new open window
When click on HRIS Tab
Then click on employee details tab


Scenario: open employee details

Given capture window id 

Scenario: Test travel Tab
Given click on tavel tab
When select value from dropdown and add value
Then capture screenshot of selected values
Then deselect last value
And capture the screenshot agian


