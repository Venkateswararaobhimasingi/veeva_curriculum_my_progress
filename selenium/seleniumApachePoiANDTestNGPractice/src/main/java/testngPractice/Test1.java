package testngPractice;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	void login() {
		System.out.println("login");
	}
	
	@Test
	void register() {
		System.out.println("register");
	}
	/*@Test(priority = 2)
	void login() {
		System.out.println("login");
	}
	
	@Test(priority = 1)
	void register() {
		System.out.println("register");
	}*/
	
	/*@Test(priority = -1)
	void login() {
		System.out.println("login");
	}
	
	@Test(priority = 1)
	void register() {
		System.out.println("register");
	}*/
	

}
