package practice;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> ch=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		
		for(WebElement c:ch) {
			c.click();
		}
		
		

	}

}
