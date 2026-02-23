package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
	WebDriver driver;
	LoginPage lp;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		
	  
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		
	   
	}
	
	@When("User enters Email as {string} and password {string}")
	public void user_enters_email_as_and_password(String email, String passwd) {
	    lp.setEmail(email);
	    lp.setPassword(passwd);
	}
	
	@When("Click on Login")
	public void click_on_login() {
	    lp.clickLogin();
	}
	
	@Then("In place Register user email will display {string}")
	public void in_place_register_user_email_will_display(String accountemail) {
	    String s=lp.accountFound();
	    if(accountemail.equals(s)) {
	    	System.out.println("login success");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	System.out.println("login fail");
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	}
	
	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		
	   lp.clickLogout();
	}
	
	@Then("In place of user email at Register will replace by {string}")
	public void in_place_of_user_email_at_register_will_replace_by(String string) {
		String s=lp.afterLogout();
	    if(s.equals(string)) {
	    	System.out.println("logout success");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	System.out.println("logout fail");
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	}
	
	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}


}
