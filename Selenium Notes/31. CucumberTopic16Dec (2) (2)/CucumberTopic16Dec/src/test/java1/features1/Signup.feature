Feature: Signup test

Scenario: verify signup test with valid details

	Given user launch the browser
	When user navigate on the signup page
	And user enter username "testacc122" and password "test" on signup
	And user click on signup button 
	Then user get successful message ""
