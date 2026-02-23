package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObject {

	
	WebDriver driver;
	public SearchPageObject(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Search']") WebElement serachInput;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']") WebElement searchBtn;
	
	@FindBy(xpath = "(//div[@class='row'])[5]/div//h4") List<WebElement> titlesofProduct;
	

	
	public void setSearchInput(String inp) {
		serachInput.sendKeys(inp);
	}
	
	public void clickSerachBtn() {
		searchBtn.click();
	}
	
	public List<String> getTitleProducts() {
		List<String> titles=new ArrayList();
		for(WebElement e:titlesofProduct) {
			if(e.isDisplayed()) {
				String t=e.getText();
				titles.add(t);
			}
		}
		return titles;
		
		
	}
}
