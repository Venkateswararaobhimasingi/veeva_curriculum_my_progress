package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddUserOrange;

public class AddUserOrangeSteps{
	BaseClass con;
	AddUserOrange  auo;
	
	public AddUserOrangeSteps(BaseClass con) {    //dependence injection  //dependence injection is add by cucumber-picocontainer here add by the package
		this.con=con;
	}

	@When("click on the admin on silde bar")
	public void click_on_the_admin_on_silde_bar() {
		con.log.info("=== Clicking on Admin sidebar ====");
	    auo=new AddUserOrange(con.driver);
	    auo.clickadmin();
	}
	
	@When("click on the add button  under the user management")
	public void click_on_the_add_button_under_the_user_management() {
		con.log.info("=== Clicking on Add button under User Management ===");
	    auo.clickaddbtn();
	}
	
	@When("select the User Role {string}")
	public void select_the_user_role(String string) {
		
		con.log.info("=== Selecting User Role: " + string);
	    boolean flag=auo.setUserRole(string);
	    Assert.assertTrue(flag);
	}
	
	@When("select status as {string}")
	public void select_status_as(String string) throws InterruptedException {
		
		con.log.info("===  Selecting Status: " + string);
	    boolean flag=auo.setStatus(string);
	    Assert.assertTrue(flag);
	}
	
	@When("Enter the Employee Name as profile employee Name and username {string}")
	public void enter_the_employee_name_as_profile_employee_name_and_username(String string2) throws InterruptedException {
		con.log.info("Entering Employee Name: profile emp name  and Username: " + string2);
		boolean flag=auo.setEmployeeName();
		auo.setUsername(string2);
		
		con.log.info("Entering details " +flag);
		Assert.assertTrue(flag);
	}
	
	@When("Enter the password {string} and confirm passwd {string}")
	public void enter_the_password_and_confirm_passwd(String string, String string2) {
		
		con.log.info("Entering password and confirm password");
	auo.setPasswd(string);
	auo.setConfPasswd(string2);
	
	}
	
	@When("click on the save button")
	public void click_on_the_save_button() {
		 con.log.info("Clicking on Save button");
	    auo.clickSavebtn();
	}
	
	@Then("success splash message will appear")
	public void success_splash_message_will_appear() {
	    String s=auo.suucessMsg();
	    con.log.info("Success message displayed: " + s);
	    if(s.equalsIgnoreCase("Successfully Saved")) {
	    	con.log.info("User added successfully - Test Passed");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	con.log.error("User not added - Test Failed");
	    	Assert.assertTrue(false);
	    }
	}



}
