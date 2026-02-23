package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_popup_alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if auth popup deails find then do normal pr0cess but if not found details do below
		// see these type of auth popups must use the sql injection like in the url
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
