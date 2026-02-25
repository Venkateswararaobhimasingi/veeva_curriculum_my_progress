package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GooglePageObject {
	WebDriver driver;
	
	public GooglePageObject(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	
	public String getTitle() {
		
		String s="";
		WebElement title=driver.findElement(By.xpath("//title[normalize-space()='Google']"));
		if(title.isDisplayed()) {
			s=title.getText();
		}
		else {
			s=driver.getTitle();
		}
		return s;
	}
	
	public String getUrlofPage() {
		String s=driver.getCurrentUrl().toString();
		return s;
	}
}
