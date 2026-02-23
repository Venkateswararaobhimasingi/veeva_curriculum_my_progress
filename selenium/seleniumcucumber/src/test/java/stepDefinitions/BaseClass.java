package stepDefinitions;

import org.openqa.selenium.WebDriver;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BaseClass {
	public WebDriver driver;   //dependence injection is add by cucumber-picocontainer here add by the package
	
	public Logger log=LogManager.getLogger(BaseClass.class);
}
