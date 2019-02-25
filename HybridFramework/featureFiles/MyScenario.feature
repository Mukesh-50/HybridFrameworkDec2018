Feature: Test OrangeHRM Login

	Scenario: Test OrangeHRM with valid login
	Given Open Chrome and open application
	When I enter admin and admin123 
	Then user should be able to login