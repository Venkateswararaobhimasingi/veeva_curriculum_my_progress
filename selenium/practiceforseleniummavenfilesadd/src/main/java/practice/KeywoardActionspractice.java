package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeywoardActionspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		
		driver.findElement(By.xpath("//form[@id='textCompareForm']//textarea[1]")).sendKeys("venkat");
		
		Actions act=new Actions(driver);
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		//Ctrl+C
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		//TAB
		
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
		//CTRL+V
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		
		//open in new window
		WebElement fedb=driver.findElement(By.xpath("//a[normalize-space()='Feedback']"));
		
		act.keyDown(Keys.CONTROL).click(fedb).keyUp(Keys.CONTROL).build().perform();
		
		

	}

}
