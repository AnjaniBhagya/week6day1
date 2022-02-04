Feature: Create Lead fuctionality


Scenario Outline: TC_001 Create Lead - Positive 

Given Enter Username as <userName>
Given Enter password as <password>
When Click on Login button
Then Homepage is displayed 
When Click on Leads as 'Leads'
Then Click on CreateLeads as  'Create Lead' 
Given Enter CompanyName as <cname>
Given Enter FirstName as <fname>
Given Enter LastName as <lname>
When Click on Submit Button
Then Lead is Created

Examples:
|userName||password||cname||fname||lname|
|'DemoSalesManager'||'crmsfa'||'TestLeaf'||'Hari'||'R'|