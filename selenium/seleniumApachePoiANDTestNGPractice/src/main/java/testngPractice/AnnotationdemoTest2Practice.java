package testngPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AnnotationdemoTest2Practice {
	
	
	@Test(priority = 2)
	void advSearch() {
		System.out.println("ADV Search");
	}
	
	@AfterTest
	void logout() {
		System.out.println("logout ...");
	}

}
