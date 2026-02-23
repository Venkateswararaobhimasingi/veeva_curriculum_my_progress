package practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerpractice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		HashMap<String, Integer> monthMap = new HashMap<>();

        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);
        
        String ryear1="2025";
        String rmonth1="January";
        String rday1="2";
        
        int ryear=Integer.valueOf(ryear1);
        int rmonth=monthMap.get(rmonth1);
        int rday=Integer.valueOf(rday1);
        
		
		String month1=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		int month=monthMap.get(month1);
		
		String year1=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		int year=Integer.valueOf(year1);
		
		String day1=driver.findElement(By.xpath("//td/a[contains(@class,'highlight')]")).getText();
		int day=Integer.valueOf(day1);
		/*
				//table[@class='ui-datepicker-calendar']//tbody//td[@data-event='click']
				
		WebElement past=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
		
		
		WebElement furture=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")); */
		
		
		/*
		if(day<rday) {
		
		List<WebElement> da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) >"+day+"]"));
		System.out.println(da.size());
		}
		else {
			List<WebElement> da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) >"+day+"]"));
			System.out.println(da.size());
		}
		*/
		if(ryear>year) {
			while(true) {
				String month2=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
				
				String year2=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(month2.equals(rmonth1) && year2.equals(ryear1)) {
					break;
				}
				
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
				List<WebElement> da;
				if(day<rday) {
					
					 da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) >="+day+"]"));
					System.out.println(da.size());
					}
					else {
						 da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) <="+day+"]"));
						System.out.println(da.size());
					}
				
				for(WebElement ee:da) {
					if(rday1.equals(ee.getText())) {
						ee.click();
						break;
					}
				}
			
			
			
			
		}
		else if(ryear<year) {
			while(true) {
				String month2=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
				
				String year2=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(month2.equals(rmonth1) && year2.equals(ryear1)) {
					break;
				}
				
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
				List<WebElement> da;
				if(day<rday) {
					
					 da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) >="+day+"]"));
					System.out.println(da.size());
					}
					else {
						 da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) <="+day+"]"));
						System.out.println(da.size());
					}
				
				for(WebElement ee:da) {
					if(rday1.equals(ee.getText())) {
						ee.click();
						break;
					}
				}
			
			
			
			
		}
		else {
			if(rmonth<month) {
				while(true) {
					String month2=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					if(month2.equals(rmonth1)) {
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					
				}
				
			}
			else {
				while(true) {
					String month2=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					if(month2.equals(rmonth1)) {
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					
				}
			}
			List<WebElement> da;
			if(day<rday) {
				
				 da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) >="+day+"]"));
				System.out.println(da.size());
				}
				else {
					 da=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler]/a[number(text()) <="+day+"]"));
					System.out.println(da.size());
				}
			
			for(WebElement ee:da) {
				if(rday1.equals(ee.getText())) {
					ee.click();
					break;
				}
			}
		
			
			
		}
		
		

	}

}
