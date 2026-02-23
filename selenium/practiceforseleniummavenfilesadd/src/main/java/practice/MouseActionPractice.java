package practice;


import java.nio.channels.AcceptPendingException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement comp=driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
		WebElement desk=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(comp).moveToElement(desk).build().perform();
		
		//act.moveToElement(comp).moveToElement(desk).click().build().perform();
		
		act.moveToElement(comp).moveToElement(desk).perform();
		

	}

}
