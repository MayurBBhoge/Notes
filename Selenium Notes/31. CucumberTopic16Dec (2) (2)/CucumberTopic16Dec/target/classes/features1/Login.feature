Feature: login functionality

Scenario: verify login with valid cred
	
	Given user launch the browser
	When user navigate on the login page
	When user enter username "testacc3" and password "test"
	When user click on login button 
	Then user get successful message "Welcome testacc3"