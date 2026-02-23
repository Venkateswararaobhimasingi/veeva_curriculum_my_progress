package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement userName;
	
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement userPasswd;
	
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement loginBtn;
	
	@FindBy(xpath = "//h6[normalize-space()='Dashboard']") WebElement dashboardTitle;
	
	public void setUsername(String uname) {
		userName.sendKeys(uname);
	}
	
	public void setUserPasswd(String upasswd) {
		userPasswd.sendKeys(upasswd);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public String getTitleName() {
		String title="";
		if(dashboardTitle.isDisplayed()) {
			title=dashboardTitle.getText();
		}
		return title;
		
	}
	

}
