package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramePage {
	WebDriver driver;
	WebDriverWait wait;
	
	public FramePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy(xpath = "//div[@data-value='I am a human']")  WebElement IAmHuman;
	
	@FindBy(xpath = "//div[@data-answer-value='Web Testing']") WebElement webTesting;
	
	@FindBy(xpath = "(//span[contains(text(),'Choose')])[1]") WebElement chooseOption;
	
	@FindBy(xpath = "(//div[@data-value='Yes'])[2]")  WebElement optionYes;
	
	
	@FindBy(xpath = "//div[@role='button']//span[contains(text(),'Next')]") WebElement nextBtn;
	
	@FindBy(xpath = "//input[@type='text']")  WebElement shortText;
	
	@FindBy(xpath = "//textarea[@aria-label='Your answer']")  WebElement longText;
	
	@FindBy(xpath = "//div[@role='button']//span[contains(text(),'Submit')]") WebElement submitBtn;
	
	public void selectIAmHuman() {
		IAmHuman.click();
	}
	
	public void selectWebTesting() {
		webTesting.click();
	}
	
	public void selectYes() {
		chooseOption.click();
		optionYes.click();
		
	}
	 public void clickNextBtn() {
	   
	     wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();
	    
	    
	     wait.until(ExpectedConditions.visibilityOf(shortText));
	    
	 
	    
	        if(shortText.isEnabled()) {
	           System.out.println("enable");
	        }
	        try{ 
	        	Thread.sleep(500);
	        } 
	        catch (InterruptedException e){
	        	
	        }
	       
	}

	public void sendShortText(String text) {
	    try {
	       
	        wait.until(ExpectedConditions.visibilityOf(shortText));
	        
	        if (shortText.isEnabled()) {
	            shortText.clear();
	            shortText.sendKeys(text);
	        } else {
	       
	            throw new Exception("Element not enabled");
	        }
	    } catch (Exception e) {
	     
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value='" + text + "';", shortText);
	       
	        js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", shortText);
	    }
	}
	
	public void sendLongText(String text) {
		longText.sendKeys(text);
		
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
		
	}
	
	

}
