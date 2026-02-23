package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarofWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//by pixel scroll
		
		/*js.executeScript("window.scrollBy(0,2000)", "");
		
		System.out.println(js.executeScript("return window.pageYOffset;"));  */
		
		//upto element visible
		/*WebElement apple=driver.findElement(By.xpath("//a[@id='apple']"));
		
		js.executeScript("arguments[0].scrollIntoView();", apple); */
		
		
		//till end scroll
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//go to back intial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		//if horizontal scroll ball use X and width
		
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		

	}

}
