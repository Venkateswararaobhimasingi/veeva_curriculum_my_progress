package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		/*File src =ts.getScreenshotAs(OutputType.FILE);
		
		File tar=new File(System.getProperty("user.dir")+"\\screenshots\\image1.png");
		
		System.out.println(System.getProperty("user.dir"));
		
		src.renameTo(tar);*/
		
		WebElement img2=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		
		File src2=img2.getScreenshotAs(OutputType.FILE);
		
		File tar2=new File(System.getProperty("user.dir")+"\\screenshots\\image2.png");
		src2.renameTo(tar2);

	}

}
