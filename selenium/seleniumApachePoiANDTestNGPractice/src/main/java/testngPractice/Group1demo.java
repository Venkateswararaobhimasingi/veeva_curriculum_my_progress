package testngPractice;

import org.testng.annotations.Test;

public class Group1demo {

	@Test(priority = 1,groups = {"sanity"})
	void signUpByEmail() {
		System.out.println("sign up by google");
		
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void signUpByGoogle() {
		System.out.println("sign up by Google");
		
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void signUpByMicrosoft() {
		System.out.println("sign up by microsoft");
		
	}
}
