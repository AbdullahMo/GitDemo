

Feature: Login Functionality

Background: 
Given validate browser is launched
When browser is triggered
Then validate browser navigated to url

Scenario: Valid Login
Given User is on banking landing page
When User login into application with "jin" and "1234"
Then Homepage is loaded
And Logout button is displayed is "True"

Scenario: Invalid Login
Given User is on banking landing page
When User login into application with "john" and "1234"
Then Homepage is loaded
And Logout button is displayed is "False"

Scenario: Valid Sign Up Using Datatable
Given User is on banking landing page
When User sign up using following details
| Jenny | abcd | john@abcd.com | Australia | 32454323 |

Then Homepage is loaded
And Logout button is displayed is "False"

Scenario Outline: Valid Login Using Examples and Scenario Outline
Given User is on banking landing page
When enter credentials <Username> and <Password>
Then Homepage is loaded
And Logout button is displayed is "True"

Examples:
| Username | Password |
| User1 | Password1 |
| User2 | Password2 |
| User3 | Password3 |
| User4 | Password4 |

