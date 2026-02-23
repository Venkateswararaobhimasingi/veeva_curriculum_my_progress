Feature: Add User
	@regression
	Scenario: Adding users to the orange demo website 
	Given User Launch Chrome Browser
	When User Open Url of "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" website
	And  User Enter the UserName "Admin" and Password "admin123"
	And  Click on Login button 
	Then Redirect to the Dashbaord Page
	When  click on the admin on silde bar 
	And  click on the add button  under the user management
	And  select the User Role "ESS"
	And select status as "Enabled"
	And Enter the Employee Name as profile employee Name and username "Demo21234321"
	And Enter the password "Demo21234321" and confirm passwd "Demo21234321"
	And click on the save button 
	Then success splash message will appear 
	And close the browser
	
	