package testngPractice;

import java.beans.Transient;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestPractice {
	WebDriver driver;

	@Test(priority = 1)
	void openWeb() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority = 2)
	void logoDisplay() throws InterruptedException {
		Thread.sleep(1000);
		boolean sta=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("status "+sta);
	}
	@Test(priority = 3)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println("login done");
		
		
	}
	@Test(priority = 4)
	void closeWeb(){
		System.out.println("close ");
		driver.quit();
	}
	
	
}

/*
 * package testngPractice;

import java.beans.Transient;
import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestPractice {
	WebDriver driver;

	@Test(priority = 1)
	void openWeb() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/register");
		
	}
	
	
	@Test(priority = 2)
	void login() {
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin123klbnm@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		String sp=driver.findElement(By.xpath("//div[@class='result']")).getText();
		
		System.out.println("status "+sp);
		System.out.println("login done");
		
		
	}
	@Test(priority = 4)
	void closeWeb(){
		System.out.println("close ");
		driver.quit();
	}
	
	
}
*/
