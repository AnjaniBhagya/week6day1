Feature: Edit Lead Functionality

Scenario: Edit Lead - Positive flow

Given Enter Username1 as 'DemoSalesManager'
Given Enter password1 as 'crmsfa'
When Click on Login1 button
Then Homepage1 is displayed 
When Click on Leads1
Then Click on FindLeads1 
Given Enter Search Name1 
When Click on FindLeads Button1
Then Click on Result1
When Click on Edit
Given Update companyName
Then Click EditSubmit Button