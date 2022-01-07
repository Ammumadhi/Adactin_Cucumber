Feature: Testing Adactin application end to end process

Scenario: Verify that user is able to login the application

Given user launch the application
When user enters the valid username in  the username field
And user enters the valid password in the password field
And user click onthe login button 
Then user verify the homepage enters to search hotel      