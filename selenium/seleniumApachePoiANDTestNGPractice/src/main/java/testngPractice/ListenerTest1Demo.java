package testngPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListenerTest1Demo {
	
	WebDriver driver;

	@BeforeClass
	void openWeb() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority = 1)
	void testlogoDisplay() throws InterruptedException {
		Thread.sleep(1000);
		boolean sta=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("status "+sta);
	}
	@Test(priority = 2)
	void testLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin1");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		
	}
	
	@Test(priority = 3,dependsOnMethods = {"testLogin"})
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
	void closeWeb(){
		System.out.println("close ");
		driver.quit();
	}

}
