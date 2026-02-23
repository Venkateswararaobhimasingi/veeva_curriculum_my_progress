package testngPractice;

import java.beans.Transient;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//dewen34576@manupay.com ,test123
//venkate123@gmail.com ,venkate123@gmail.com
//venkates@123gmail.com, venkates@123

public class DataProvider {
	
	WebDriver driver;
	
	@BeforeClass
	void openWeb() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String email,String passwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		boolean st=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(st) {
			driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
			driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
			Assert.assertTrue(st);
		}
		else {
			Assert.fail();
		}
	}

	
	//@org.testng.annotations.DataProvider(name="dp",indices = {0,3})  here see some parameter upto the indices can passed to test
	
	//@org.testng.annotations.DataProvider(name="dp",indices = {0,2,3,4})  specific all the data can send
	@org.testng.annotations.DataProvider(name="dp")
	Object[][] loginData(){
		
		Object data[][]= {
				{"dewen34576@manupay.com" ,"test123"},
				{"abc123@gmail.com","test123"},
				{"testing123@gmail.com","123test"},
				{"venkate123@gmail.com" ,"venkate123@gmail.com"},
				{"def123@gmail.com","defc123"},
				{"autotesting123@gmail.com","auto123test"},
				{"venkates@123gmail.com", "venkates@123"},
				
		};
		return data;
		
	}
	
	@AfterClass
	void closeWeb() {
		driver.close();
	}

}
