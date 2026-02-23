package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFilesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		/* driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\B.VENKATESWARA RAO\\Documents\\Downloads\\Thank_You_PPT_Background_16x9.png");
		
		WebElement f=driver.findElement(By.xpath("//ul[@id='fileList']/li"));
		
		System.out.println(f.getText());  */
		
		String s1="C:\\Users\\B.VENKATESWARA RAO\\Documents\\Downloads\\Thank_You_PPT_Background_16x9.png";
		String s2="C:\\Users\\B.VENKATESWARA RAO\\Documents\\Downloads\\UlstEDZ19aozXZ3UXzlI_.png";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(s1+"\n"+s2);
		
		List<WebElement> f=driver.findElements(By.xpath("//ul[@id='fileList']/li"));
		
		System.out.println(f.size());
		

	}

}
