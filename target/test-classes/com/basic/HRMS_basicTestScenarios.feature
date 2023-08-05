Feature: This file contains test scenarios of add employee

Scenario: 1.Validate New employee getting created and seached in HRMS Systems.
	Given Login with admin user
	When Go to PIM Tab	
	Then Validate user getting searched
	
Scenario: 2.Validate employee not getting created if mandatory fileds missing.
	Given  Login with admin user
	When Go to PIM Tab
	Then Validate user not getting searched.