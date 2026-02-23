package practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomthePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='60%'");
		
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='150%'");
		
		
		

	}

}
