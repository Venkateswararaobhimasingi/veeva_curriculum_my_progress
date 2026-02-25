package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.GooglePageObject;


public class GoogleTestCase {

	public WebDriver driver;
	GooglePageObject gp;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
       
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void loginTest() {
		gp=new GooglePageObject(driver);
		
		String t=gp.getTitle();
		if(t.equalsIgnoreCase("Google")) {
			System.out.println("Title is verify "+ t);
		}else {
			Assert.assertTrue(false);
		}
		String k=gp.getUrlofPage();
		int f=0;
		String[] v=k.split("/");
		for(int i=0;i<v.length;i++) {
			if(v[i].equalsIgnoreCase("www.google.com")) {
				System.out.println(v[i]);
				System.out.print("url verify done");
				f=1;
				Assert.assertTrue(true);
			}
			//System.out.println(v[i]);
		}
		if(f==0) {
			System.out.println("url not verfiy");
			Assert.assertTrue(false);
		}
		
	}
	

	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
}
