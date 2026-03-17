package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.FramePage;

public class TC002_FrameTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/iframes");
		
	}
	
	@Test
	public void iframeTest() {
		
		driver.switchTo().frame(0);
		
		FramePage fp=new FramePage(driver);
		
		fp.selectIAmHuman();
		fp.selectWebTesting();
		fp.selectYes();
		fp.clickNextBtn();
	
		fp.sendShortText("venkat");
		fp.sendLongText("Venkatesh");
		fp.clickSubmitBtn();
		
		

	}
	
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		
	}

}
