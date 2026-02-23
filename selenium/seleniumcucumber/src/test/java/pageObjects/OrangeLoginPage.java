package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class OrangeLoginPage {

	public WebDriver driver;
	public OrangeLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	By userNameInput=By.xpath("//input[@placeholder='Username']");
	By userPasswdInput=By.xpath("//input[@placeholder='Password']");
	By loginbtn=By.xpath("//button[normalize-space()='Login']");
	By dashBoard=By.xpath("//h6[normalize-space()='Dashboard']");
	
	By Profile=By.xpath("//span[@class='oxd-userdropdown-tab']");
	By Logout=By.xpath("(//ul[@role='menu'])[1]//a[contains(text(),'Logout')]");
	
	@FindBy(xpath = "//h5[normalize-space()='Login']") WebElement txtLogin;
	public void setuserNameInput(String username) {
		driver.findElement(userNameInput).sendKeys(username);;
		
	}
	
	public void setuserPasswdInput(String passwd) {
		driver.findElement(userPasswdInput).sendKeys(passwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginbtn).click();
		
	}
	
	public String getDashboardText() {
		String s="";
		WebElement dash=driver.findElement(dashBoard);
		if(dash.isDisplayed()) {
			s=dash.getText();
		}
		return s;
		
	}
	public void clickProfile() {
		driver.findElement(Profile).click();
		
	}
	
	public void clickLogout() {
		
		driver.findElement(Logout).click();
		
	}
	public String txtLogin() {
		String s="";
		if(txtLogin.isDisplayed()) {
			s=txtLogin.getText();
		}
		return s;
	}
}
