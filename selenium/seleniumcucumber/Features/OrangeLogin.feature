Feature: Login in orange website
	@sanity
	Scenario: successfully login in the orange demo website
	Given User Launch Chrome Browser
	When User Open Url of "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" website
	And  User Enter the UserName "Admin" and Password "admin123"
	And  Click on Login button 
	Then Redirect to the Dashbaord Page
	When Click on the Profile 
	And then list of the item with some options are visible and click on logout button 
	Then Logout success  
	And close the browser  
	
