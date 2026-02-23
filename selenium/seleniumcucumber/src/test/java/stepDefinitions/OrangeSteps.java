package stepDefinitions;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OrangeLoginPage;

public class OrangeSteps {
	
	public BaseClass con;   //dependence injection is add by cucumber-picocontainer here add by the package
	//public WebDriver driver;
	public OrangeLoginPage op;
	
	public OrangeSteps(BaseClass con) {
		// TODO Auto-generated constructor stub
		this.con=con;
	}
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		con.log.info("====  Browser launch ===");
		con.driver=new ChromeDriver();
		op=new OrangeLoginPage(con.driver);
		
		
		con.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		con.driver.manage().window().maximize();
		 
	}

	@When("User Open Url of {string} website")
	public void user_open_url_of_website(String url) {
		
		con.log.info("=== url open ====");
		
		con.driver.get(url);
	    
	}

	@When("User Enter the UserName {string} and Password {string}")
	public void user_enter_the_user_name_and_password(String username, String passwd) {
		
		con.log.info(" === enter username and passwd");
		
		op.setuserNameInput(username);
		op.setuserPasswdInput(passwd);
	    
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		
		con.log.info(" === click login button ===");
		op.clickLoginBtn();
	    
	}

	@Then("Redirect to the Dashbaord Page")
	public void redirect_to_the_dashbaord_page() {
		
		con.log.info("===  redriect to dashboard page ===");
		String s=op.getDashboardText();
		if(s.equals("Dashboard")) {
			System.out.println("login successfully");
			con.log.info(" === login successful");
		Assert.assertTrue(true);
		}
		else {
			
			
			con.log.error("===  login fail ===");
			System.out.println("login fail");
			con.driver.close();
			Assert.assertTrue(false);
		}
	    
	}

	@When("Click on the Profile")
	public void click_on_the_profile() {
		
		con.log.info("=== click on profile ===");
	    op.clickProfile();
	}

	@When("then list of the item with some options are visible and click on logout button")
	public void then_list_of_the_item_with_some_options_are_visible_and_click_on_logout_button() {
		
		con.log.info("=== click on logout === ");
		op.clickLogout();
	    
	}

	@Then("Logout success")
	public void logout_success() {
		String logintxt=op.txtLogin();
		if(logintxt.equals("Login")) {
			System.out.println("logout done");
			con.log.info("===  logout done ===");
			Assert.assertTrue(true);
		}
		else {
			
			con.log.error("=== logout fail ===");
			System.out.println("logout fail");
			con.driver.close();
			Assert.assertTrue(false);
		}
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		con.log.info("===  browser close  ===");
	    con.driver.quit();
	}



}
