package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> dt=driver.findElements(By.xpath("//ul[@id='pagination']/li"));
		int page_size=dt.size();
		
	
		
		for(int i=1;i<page_size;i++) {
			
			List<WebElement> trr=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr"));
			for(int j=1;j<=trr.size();j++) {
			
			String Name=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+j+"]//td[2]")).getText();
			
			
			String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+j+"]//td[3]")).getText();
			System.out.println(Name+"               "+price);
			Thread.sleep(2000);
			int r=i+1;
			if(r<=page_size)
				driver.findElement(By.xpath("//ul[@id='pagination']/li["+r+"]")).click();
			}
			
		}
		
		
		
		
		
		

	}

}
