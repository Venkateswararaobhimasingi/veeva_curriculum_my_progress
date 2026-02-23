package testCases;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestToOpenBrowser {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void setUp(String browser) {
		try {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("browser launch fail");
			Assert.assertTrue(false);
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("browser launch successfully");
		
		Thread.sleep(5000);
		driver.quit();
		Assert.assertTrue(true);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
