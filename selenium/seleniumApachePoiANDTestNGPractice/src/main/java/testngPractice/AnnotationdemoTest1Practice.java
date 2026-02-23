package testngPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class AnnotationdemoTest1Practice {
	@BeforeTest
	void login() {
		System.out.println("login ...");
		
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("search ...");
	}
	
	

}
