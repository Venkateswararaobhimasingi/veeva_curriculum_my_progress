package testngPractice;

import org.testng.annotations.Test;

public class Group2Demo {
	@Test(priority = 1,groups = {"regression"})
	void loginByEmail() {
		System.out.println("login by email");
	}
	
	@Test(priority = 2,groups = {"regression"})
	void loginByGoogle() {
		System.out.println("login by google");
	}
	
	@Test(priority = 3,groups = {"regression"})
	void loginByMicrosoft() {
		System.out.println("login by microsoft");
	}

}
