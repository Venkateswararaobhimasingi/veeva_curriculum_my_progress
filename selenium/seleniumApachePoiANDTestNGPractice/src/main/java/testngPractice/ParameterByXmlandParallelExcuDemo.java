package testngPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Test
public class ParameterByXmlandParallelExcuDemo {
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 1)
	@Parameters({"username","passwd"})
	void testLogin(String username,String passwd) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println("login done");
	}
	
	@Test(priority = 2)
	void testLogo() {
		boolean logo=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(logo) {
			Assert.assertTrue(logo);
			
		}
		else {
			Assert.assertTrue(logo);
		}
	}
	
	@AfterClass
	void closeSetup() {
		driver.close();
	}

}
