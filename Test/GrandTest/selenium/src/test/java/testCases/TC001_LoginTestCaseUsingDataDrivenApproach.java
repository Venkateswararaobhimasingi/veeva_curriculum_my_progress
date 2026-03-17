package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utilities.DataProviderUtilities;

public class TC001_LoginTestCaseUsingDataDrivenApproach {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
	}
	
	@Test(dataProvider = "loginData",dataProviderClass = DataProviderUtilities.class)
	public void verifyLoginPage(String userEmail,String passwd,String expectedResult ) {
		
		LoginPage lp=new LoginPage(driver);
		lp.clickLoginLink();
		
		lp.setEmail(userEmail);
		
		lp.setPassword(passwd);
		
		lp.clickLogin();
		
		String accountEmail=lp.accountFound();
		
		if(accountEmail.equals(userEmail)) {
			Assert.assertEquals(expectedResult, "valid");
			lp.clickLogout();
			
		}
		else {
			Assert.assertEquals(expectedResult, "invalid");
			
			
		}
		
		
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}

}
