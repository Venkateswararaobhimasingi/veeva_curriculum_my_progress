package practice;



import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassPractice {
	
	public static void main(String arg[]) throws AWTException, IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		//driver.get("https://tutorialsninja.com/demo/");
		
		/* driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("HP");
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER); */
		
		/* Robot rb=new Robot();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd_HHmmss");
		String dt=sdf.format(new Date());
		
		Rectangle rect=new Rectangle(0,0,500,500);
		
		BufferedImage src=rb.createScreenCapture(rect);
		
		String path="./screenshots/screenshot_"+dt+".png";
		
		ImageIO.write(src, "PNG", new File(path));   */
		
		/* Robot rb=new Robot();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd_HHmmss");
		String dt=sdf.format(new Date());
		
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(d);
		
		BufferedImage src=rb.createScreenCapture(rect);
		
		String path="./screenshots/screenshot_"+dt+".png";
		
		ImageIO.write(src, "PNG", new File(path)); */
		
		driver.get("https://omayo.blogspot.com/");
		
		Robot rb=new Robot();
		
		rb.mouseWheel(25);
		
		rb.delay(2000);
		
		rb.mouseWheel(-5);
		
		
		
		
	
}
}
