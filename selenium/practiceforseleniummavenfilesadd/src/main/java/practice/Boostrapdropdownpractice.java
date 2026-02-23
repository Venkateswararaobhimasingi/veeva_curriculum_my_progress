package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boostrapdropdownpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox1']")).click();
		
		List<WebElement> opt=driver.findElements(By.xpath("(//div[contains(@id,'comboTree') and contains(@id,'DropDownContainer')])[2]//ul/li"));
		
		System.out.println(opt.size());
		
		
		for(WebElement op:opt) {
			op.click();
			Thread.sleep(2000);
		}
		
		
		

	}

}
