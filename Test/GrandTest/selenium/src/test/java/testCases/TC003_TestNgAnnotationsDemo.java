package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC003_TestNgAnnotationsDemo {
	
	WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.out.println("--- Starting Test ---");
    }

    @BeforeMethod
    public void launchBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }

    @Test(priority=1)
    public void verifyTitle(){
        String title=driver.getTitle();
        Assert.assertEquals(title,"Google");
    }

    @Test(priority=2)
    public void verifySearchBox(){
        boolean isDisplayed=driver.findElement(By.name("q")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @AfterMethod
    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
    
    @AfterClass
    public void tearDown() {
    	 System.out.println("--- Test Done ---");
	}

}
