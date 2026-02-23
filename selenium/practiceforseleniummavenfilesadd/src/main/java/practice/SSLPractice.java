package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SSL allow to unsecure pages
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		//WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");

	}

}
