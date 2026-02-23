package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunIncongintoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		male.click();
		if(male.isSelected()) {
			System.out.println("ok");
		}
		else {
			System.out.println("no");
		}

	}

}
