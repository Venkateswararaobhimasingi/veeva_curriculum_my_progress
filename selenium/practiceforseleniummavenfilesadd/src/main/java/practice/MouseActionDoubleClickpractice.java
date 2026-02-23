package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionDoubleClickpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		WebElement fr=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(fr);
		
		WebElement inp1 = driver.findElement(By.id("field1"));
		WebElement inp2 = driver.findElement(By.id("field2"));
		WebElement btn  = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		inp1.clear();
		inp1.sendKeys("hell");

		Actions act = new Actions(driver);
		act.doubleClick(btn).perform();

		// Wait until value is copied (better than Thread.sleep)
		Thread.sleep(5000);

		String s  = inp2.getAttribute("value");
		String s1 = inp1.getAttribute("value");

		if (s.equals(s1)) {
		    System.out.println("TRUE : " + s + " " + s1);
		} else {
		    System.out.println("FALSE : " + s + " " + s1);
		}

	}

}
