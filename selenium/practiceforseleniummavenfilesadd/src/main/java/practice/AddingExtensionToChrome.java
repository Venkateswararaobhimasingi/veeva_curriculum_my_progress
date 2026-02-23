package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingExtensionToChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		//File ext=new File("C:\\Users\\B.VENKATESWARA RAO\\selenium-practice\\practiceforseleniummavenfilesadd\\extensionToChrome\\SelectorsHub-Chrome-Web-Store.crx");
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--load-extension=C:\\Users\\B.VENKATESWARA RAO\\selenium-practice\\practiceforseleniummavenfilesadd\\extensionToChrome\\SelectorsHub-Chrome-Web-Store.crx");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//not working
		
		
	}

}
