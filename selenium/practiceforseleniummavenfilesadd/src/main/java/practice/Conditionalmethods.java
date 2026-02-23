package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Conditionalmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		System.out.println(logo.isDisplayed());
		
		WebElement FN=driver.findElement(By.xpath("//input[@id='FirstName']"));
		if(FN.isEnabled()) {
			FN.sendKeys("venkat");
		}
		else {
			System.out.println("not enable to enter");
		}
		
		System.out.println("is select on gender selecting on radio buttons");
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("status male "+male.isSelected()+" female "+female.isSelected());
		
		System.out.println("male is selected by using click");
		male.click();
		System.out.println("now status male "+male.isSelected()+" female "+female.isSelected());
		
		System.out.println("female is selected by using click");
		female.click();
		System.out.println("now status male "+male.isSelected()+" female "+female.isSelected());
		
		
		

	}

}
