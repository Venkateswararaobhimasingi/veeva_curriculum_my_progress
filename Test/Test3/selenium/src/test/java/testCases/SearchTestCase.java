package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import PageObjects.SearchPageObject;

public class SearchTestCase {

	
	public WebDriver driver;
	SearchPageObject sc;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		sc=new SearchPageObject(driver);
		String inp="mac";
		sc.setSearchInput(inp);
		sc.clickSerachBtn();
		Thread.sleep(5000);
		List<String> title=sc.getTitleProducts();
		for(String t: title) {
			System.out.println(t);
		}
		if(title.size()==0) {
			System.out.println("Elements not found");
			Assert.assertTrue(false);
		}
		
		Assert.assertTrue(true);
		
		
		
		
		
	}
	

	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
