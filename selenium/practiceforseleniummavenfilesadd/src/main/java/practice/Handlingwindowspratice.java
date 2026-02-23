package practice;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindowspratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String>  ids=driver.getWindowHandles();
		
		
		 ArrayList<String> wid=new ArrayList<String>(ids);
		
		String w1=wid.get(0);
		String w2=wid.get(1);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(w2);
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(w1);
		
		System.out.println(driver.getTitle());  
		
		
		/* for(String id1:ids) {
			
			// match via title or ul can withing in for loop can do...
		}
		 */
		
		
		

	}

}
