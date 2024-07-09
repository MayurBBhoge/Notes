Feature: login functionality

Scenario: verify login with valid cred
	
	Given user launch the browser
	When user navigate on the login page
	When user enter username and password
	When user click on login button 
	Then user get successful message 

Scenario: verify login with invalid cred
	
	Given user launch the browser
	When user navigate on the login page
	And user enter username and password
	And user click on login button 
	Then user will not logged in