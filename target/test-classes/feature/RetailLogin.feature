@all
Feature: Retail Page   


Background:
Given User is on Retail website
And User click  on MyAccount
When  User click on Login 
And User enter username "Ali.ershad1@tekschool.us" and password "12345678" 
And User click on Login button
Then User should be logged in to MyAccount dashboard

Scenario: Validate the login functionality


@AffiliateUser
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|ChequePayeeName|
|TEKSchool|http://tek-school.com/retail|123456|Cheque|Ershad|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message 
@Edit
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink 
#And user click on Bank Transfer radio button
And User fill Bank information with below information
|paymentMethod|bankName|abaNumber|swiftCode|accountName|accountNumber|
|BankTransfer|BoA|123456789101112|456789|Aliershad|123456789101112|
And User click on Continue button after adding bank info  
Then User should see a success message after click on Continue button

@EditAccount
Scenario: Edit your account Information 
When User click on 'Edit your account information' link 
And User modify below information 
|firstname|lastName|email|telephone|
|Aliahmad|Ershad|Ali.ershad1@tekschool.us|9167434307|
And User click on continue button 
Then User should see this message 'Success: Your account has been successfully updated.'


