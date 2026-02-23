package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPreactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//normal alert with ok button only
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert art=driver.switchTo().alert();   //Alert can consider separate window now capture this and by speacial by the Alert class
		
		System.out.println(art.getText());
		
		art.accept();  // accept method is used for the close to alert as per like clicking on the ok button of alert
		
	    //if having two buttons in alert where the ok and cancel here from cancel have dismiss cmd
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	
		Alert dart=driver.switchTo().alert();
		
		//dart.accept();
		
		dart.dismiss();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert part=driver.switchTo().alert();
		
		part.sendKeys("hello");
		part.accept();
		
		
		
		
		
		
		
		
		
		
		

	}

}
