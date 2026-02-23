package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenlinksPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		int c=0;
		
		for(WebElement link:links) {
			String s=link.getAttribute("href");
			if(s.isEmpty() || s==null) {
				continue;
			}
			if (!s.startsWith("http")) {
		        continue;
		    }
			
			try {
				URL ulinks=new URL(s);
				HttpURLConnection hlink=(HttpURLConnection) ulinks.openConnection();
				  hlink.setConnectTimeout(5000);
				hlink.connect();
				if(hlink.getResponseCode()>=400) {
					System.out.println(s + " ---> Broken");
					c++;
				}
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		System.out.println(c);

	}

}
