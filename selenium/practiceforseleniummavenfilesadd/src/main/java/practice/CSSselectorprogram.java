package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorprogram {
	public static void main(String arg[]) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// here below all cases the tag is optional 
		
		//tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("phones");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("phones");
		
		//tag.className
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("phones");  //class="search-box-text ui-autocomplete-input" this is class when css selector is used then first name can consider 
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//tag[attr='value']
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
		
		//tag.classsName[attr='value]
		//driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("phones");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("phones");
		
		
		
	}
}
