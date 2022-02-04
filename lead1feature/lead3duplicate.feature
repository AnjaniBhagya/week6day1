Feature: Duplicate Lead Functionality

Scenario: Duplicate Lead - Positive flow

Given Login credentials
When Click Leads and FindLeads
Then Use searchName2 to get Record
When Click Duplicate Button
Then Click CreateLead2 Buttton
