Feature: Testing Adactin application end to end process

Scenario: Verify that the User is able to login the application 

Given User launch the application 
 
When User enters the valid username in the Username field

And User enters the valid password in the Password field

And User clicks on the login button 

Then User verify the homepage and navigates to search hotel 
