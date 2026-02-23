package testngPractice;
/*1) Login   @BeforeMethod
2) Search -- @Test
3) Logout   @AfterMethod
4)Login
5)Advanced search --@test
6)Logout
*/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationdemoMethodPractice {
	
	@BeforeMethod
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
	
	@AfterMethod
	void logout() {
		System.out.println("logout ...");
	}
	
	

	
}
