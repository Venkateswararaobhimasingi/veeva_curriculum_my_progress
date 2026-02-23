package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.LoginPageObject;

public class LoginTestCase {
	
	public WebDriver driver;
	LoginPageObject lp;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		lp=new LoginPageObject(driver);
		String uname="Admin";
		String upasswd="admin123";
		lp.setUsername(uname);
		lp.setUserPasswd(upasswd);
		lp.clickLoginBtn();
		Thread.sleep(5000);
		String title=lp.getTitleName();
		Assert.assertEquals(title, "Dashboard");
		
	}
	

	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	

}
