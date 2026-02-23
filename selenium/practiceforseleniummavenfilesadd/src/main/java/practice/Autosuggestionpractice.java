package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("java we");
		
		List<WebElement> sea=driver.findElements(By.xpath("//div[@role='option']//span[contains(text(),'ja')]"));
		Thread.sleep(5000);
		
		System.out.println(sea.size());
		
		for(WebElement s:sea) {
			System.out.println(s.getText());
		}
		
		
		

	}

}
