Feature: Login
	Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://demowebshop.tricentis.com/login"
	And User enters Email as "demo212343211@gmail.com" and password "demo212343211@gmail.com"
	And Click on Login
	Then In place Register user email will display "demo212343211@gmail.com"
	When User click on Log out link
	Then In place of user email at Register will replace by "Register"
    And close browser
    
    
    
	Scenario Outline: Login  data driven
	Given User Launch Chrome browser
	When User opens URL "https://demowebshop.tricentis.com/login"
	And User enters Email as "<email>" and password "<passwd>"
	And Click on Login
	Then In place Register user email will display "<email>"
	When User click on Log out link
	Then In place of user email at Register will replace by "Register"
    And close browser
    
    Examples:
			| email | passwd |
			| demo212343211@gmail.com | demo212343211@gmail.com |
			| demo212343211@gmail.com | demo |
			| demo1@gmail.com | demo1 |
			