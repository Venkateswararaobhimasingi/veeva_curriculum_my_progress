package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_alert_using_explict_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		WebDriverWait waitart=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//normal alert with ok button only
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//Alert art=driver.switchTo().alert();   //Alert can consider separate window now capture this and by speacial by the Alert class
		
		
		Alert expart=waitart.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(expart.getText());
		
		expart.accept(); 

	}

}
