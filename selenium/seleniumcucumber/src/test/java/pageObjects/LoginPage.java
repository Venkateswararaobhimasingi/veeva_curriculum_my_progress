package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Log in']")
	WebElement btnLogin;

	//div[@class='header']//a[@class='account']  test login 
	
	@FindBy(xpath = "//div[@class='header']//a[@class='account']") WebElement account;
	
	@FindBy(xpath = "//a[normalize-space()='Log out']") WebElement btnlogout;
	
	@FindBy(xpath = "//a[normalize-space()='Register']") WebElement registerdis;
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public String accountFound() {
		try {
			return account.getText();
		}
		catch (Exception e) {
			// TODO: handle exception
			return "";
		}
	}
	public void clickLogout() {
		btnlogout.click();
		
	}
	
	public String afterLogout() {
		if(registerdis.isDisplayed())
			return registerdis.getText();
		else{
			return "";
		}
	}
	

	
	
	
}