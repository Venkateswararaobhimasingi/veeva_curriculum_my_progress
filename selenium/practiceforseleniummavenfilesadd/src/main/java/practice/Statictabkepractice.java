package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictabkepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement tb =driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));
		
		List<WebElement> tr =tb.findElements(By.xpath("//table[@name='BookTable']//tr[position()>1]"));
		
		for(WebElement td: tr) {
			List<WebElement> tds=td.findElements(By.tagName("td"));
			
			for(WebElement tp: tds) { 
				System.out.print(tp.getText()+"    ");
			}
			System.out.println("");
		}
		
		//particular col
		for(int i=2;i<tr.size();i++) {
			System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText());
		}
		
		

	}

}
