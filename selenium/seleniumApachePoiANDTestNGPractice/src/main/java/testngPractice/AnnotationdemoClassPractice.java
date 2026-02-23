package testngPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationdemoClassPractice {
	
	@BeforeClass
	void login() {
		System.out.println("login ...");
		
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("search ...");
	}
	
	@Test(priority = 2)
	void advSearch() {
		System.out.println("ADV Search");
	}
	
	@AfterClass
	void logout() {
		System.out.println("logout ...");

	}
}
