@all
Feature: Desktops


Background:
Given User is on Retail website
When User click on Desktops tab
And User click on Show all desktops

@desktops
Scenario: User verify all items are present in Desktops tab
Then User should see all items are present in Desktop page

@HP_LP
Scenario: User add HP LP 3065 from Desktops tab to the cart
And User click ADD TO CART option on ‘HP LP3065’ item
And User select quantity 1
And User click add to Cart button
Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’

@CanonEOS5D
Scenario: User add Canon EOS 5D from Desktops tab to the cart
#Given User is on Retail website
#When User click on Desktops tab
#And User click on Show all desktops
And User click ADD TO CART option on ‘Canon EOS 5D’ item
And User select color from dropdown ‘Red’
And User select quantity 1
And User click add to Cart button
Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’

@CanonEOS5D2nd
Scenario: User add a review to Canon EOS 5D item in Desktops tab
And User click on Canon EOS 5D item
And User click on write a review link
And user fill the review information with below information
|yourname|yourReview| Rating|
|Waheed Ahmad Osmani|I Love this Camera, it shots the high quality photoes|Good|
And User click on Continue Button
Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”


