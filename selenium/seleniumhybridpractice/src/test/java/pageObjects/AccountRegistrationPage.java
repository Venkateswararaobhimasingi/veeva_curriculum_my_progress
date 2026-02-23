package pageObjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	public JavascriptExecutor js;
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
			
	}
	

@FindBy(xpath="//input[@id='FirstName']") 
WebElement txtFirstname;


@FindBy(xpath="//input[@id='LastName']") 
WebElement txtLasttname;


@FindBy(xpath = "//input[@id='gender-male']")
WebElement clickmale;



@FindBy(xpath = "//input[@id='gender-female']")
WebElement clickfemale;



@FindBy(xpath="//input[@id='Email']") 
WebElement txtEmail;



@FindBy(xpath="//input[@id='Password']") 
WebElement txtPassword;


@FindBy(xpath = "//input[@id='ConfirmPassword']")
WebElement confPassword;



@FindBy(xpath="//input[@id='register-button']") 
WebElement btnregisterContinue;

@FindBy(xpath = "//div[@class='result']")
WebElement msgConfirmation;

//"Your registration completed"

@FindBy(xpath = "//input[@value='Continue']")
WebElement btnContinue;

public void setFirstName(String fname) {
	
	txtFirstname.sendKeys(fname);

}

public void setLastName(String lname) {
	txtLasttname.sendKeys(lname);

}

public void setEmail(String email) {
	txtEmail.sendKeys(email);

}



public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);

}


public void setConfirmPassword(String pwd) {
	confPassword.sendKeys(pwd);

}


public void clickregisterContinue() {
	//sol1 
	
	btnregisterContinue.click();
	
	//sol2 
	//btnregisterContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnregisterContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnregisterContinue);
	
	//Sol 5
	//btnregisterContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnregisterContinue)).click();
	
}

public void selectGender(String gen) {
	// TODO Auto-generated method stub
	
	String s=gen.toLowerCase();

	if(s.equals("male")) {
		clickmale.click();
	}
	else {
		clickfemale.click();
	}

}



public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}
}

}