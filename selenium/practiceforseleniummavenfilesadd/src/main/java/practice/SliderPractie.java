package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderPractie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		
		
	/*	WebElement s1 = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		
		
		System.out.println(s1.getLocation());
		int y=s1.getLocation().getY();
		int x=s1.getLocation().getX()+100;
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(s1, x,y).build().perform();
		
		
		System.out.println(s1.getLocation());  */
		
		WebElement s1 = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		
		
		System.out.println(s1.getLocation());
		int y=s1.getLocation().getY();
		int x=s1.getLocation().getX()-100;
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(s1, -(x),y).build().perform();
		
		
		System.out.println(s1.getLocation());
		

	}

}
