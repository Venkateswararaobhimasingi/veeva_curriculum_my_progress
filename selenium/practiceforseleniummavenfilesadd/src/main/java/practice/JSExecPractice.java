package practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','venkat')",name );
		
		js.executeScript("arguments[0].setAttribute('value','srinu199@gmail.com')", email);
		
		js.executeScript("arguments[0].click()", male);
		
		
		
	}

}
