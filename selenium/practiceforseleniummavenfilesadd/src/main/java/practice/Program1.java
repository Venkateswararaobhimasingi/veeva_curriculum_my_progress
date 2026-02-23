package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Program1 {
	public static void main(String arg[]) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=common/home");
		String head= driver.getTitle();
		if(head.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("correct");
		}
		else {
			System.out.println("Worng");
		}
		driver.close();
	}

}
