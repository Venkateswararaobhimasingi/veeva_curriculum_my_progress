package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethodsprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@class='orangehrm-copyright-wrapper']/p[2]/a")).click();
		
		
		//driver.close();
		
		driver.quit();
		
		
	
	}

}
