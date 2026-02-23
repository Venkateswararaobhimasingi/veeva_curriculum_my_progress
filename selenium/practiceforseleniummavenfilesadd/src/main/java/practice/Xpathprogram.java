package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//single attr in xpath
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("phones");
		
		//multiple attr in xpath
		
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("phones");
		
		//and operator
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms'and @placeholder='Search store']")).sendKeys("phones");
		
		//or operator
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='Search store']")).sendKeys("phones");
		
		//text()=value  it used for inner text //tag[text()='value']   or //*[text()='value']
		
		//boolean test=driver.findElement(By.xpath("//*[text()='Skip navigation']")).isDisplayed();
		//System.out.println(test);
		 
		//tag[contains(@attr,'value)]
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("phones");
		
		//starts-with
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("phones");
		
		//chained xpath it used for the if want tag not have any attr the use the parent and get path and access the tag 
		String s=driver.findElement(By.xpath("//*[@class='topic-block-title']/h2")).getText();
		System.out.println(s);
		
		

	}

}
