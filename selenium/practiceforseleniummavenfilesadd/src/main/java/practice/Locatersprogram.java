package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locatersprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.className("btn")).click(); */
		
		/*driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("HOME")).click(); */
		
		
		//driver.get("https://practicetestautomation.com/");
		//boolean dis=driver.findElement(By.className("wp-block-image")).isDisplayed();
		//System.out.println(dis);
		
		
		driver.get("https://practicetestautomation.com/blog/");
		driver.manage().window().maximize();
		List<WebElement> imglist = driver.findElements(By.tagName("img"));
		System.out.println("links"+ imglist.size());
		
		
		

	}

}
