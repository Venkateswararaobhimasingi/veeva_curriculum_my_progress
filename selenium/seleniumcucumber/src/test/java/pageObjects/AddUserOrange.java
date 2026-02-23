package pageObjects;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserOrange {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	public AddUserOrange(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']//p[2]") WebElement successfullmsg;
	
	@FindBy(xpath = "//span[normalize-space()='User Management']") WebElement Mangbtn;
	
	@FindBy(xpath = "//button[normalize-space()='Add']") WebElement Addbtn;
	
	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]") WebElement UserRole;
	
	@FindBy(xpath = "//label[text()='Status']/following::div[contains(@class,'oxd-select-text')][1]")  WebElement status;
	
	@FindBy(xpath = "//div[@role='listbox']") WebElement listbox;
	
	
	//List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']"));
	
	//Successfully Saved
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") WebElement username;
	
	@FindBy(xpath = "(//label[normalize-space()='Password']/following::input[@type='password'])[1]") WebElement passwd;
	
	@FindBy(xpath = "(//label[normalize-space()='Password']/following::input[@type='password'])[2]") WebElement confPasswd;
	
	@FindBy(xpath = "//button[normalize-space()='Save']") WebElement savebtn;
	
	@FindBy(xpath = "//span[normalize-space()='Admin']") WebElement admin;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']") WebElement profilename;
	
	public void clickadmin() {
		admin.click();
	}
	
	public void clickaddbtn() {
		Addbtn.click();
	}
	
	public boolean setUserRole(String role) {
		boolean f=false;
		UserRole.click();
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='option']"));
		for(WebElement e:options) {
			if(e.getText().equals(role)) {
				f=true;
				e.click();
			}
			
		}
		return f;
		
	}
	
	public boolean setStatus(String sta) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    status.click();

	    for (int i = 0; i < 3; i++) {
	        try {
	            List<WebElement> options = wait.until(
	                    ExpectedConditions.presenceOfAllElementsLocatedBy(
	                            By.xpath("//div[@role='option']//span")));

	            for (WebElement e : options) {
	                if (e.getText().equalsIgnoreCase(sta)) {
	                    e.click();
	                    return true;
	                }
	            }
	        } catch (StaleElementReferenceException ex) {
	            // retry
	        }
	    }
	    return false;
	}
	
	public boolean setEmployeeName() throws InterruptedException {
			
			boolean f=false;
			String name= profilename.getText();
			driver.findElement(By.xpath("//label[normalize-space()='Employee Name']/following::input[@placeholder='Type for hints...'][1]")).sendKeys(name);
			Thread.sleep(5000);
			List<WebElement> options=driver.findElements(By.xpath("//div[@role='option']"));
			for(WebElement e:options) {
				
					
					e.click();
					return true;
				
				
			}
			return f;
			
		}
	
	public void clickSavebtn() {
		savebtn.click();
	}
	
	public String suucessMsg() {
		String s="";
		if(successfullmsg.isDisplayed()) {
			s=successfullmsg.getText();
		}
		return s;
		
	}
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
		
	}
	
	public void setPasswd(String pass) {
		passwd.sendKeys(pass);
		
	}
	
	public void setConfPasswd(String cpass) {
		confPasswd.sendKeys(cpass);
	}
	
	
	
	
	
	
	
	
}
