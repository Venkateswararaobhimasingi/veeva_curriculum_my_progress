package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesMethodDemo {
	
	@Test(priority = 1)
	void openWeb() {
		System.out.println("open web");
		Assert.assertTrue(true);
	}
	@Test(priority = 2,dependsOnMethods = {"openWeb"})
	void login() {
		System.out.println("login ...");
		Assert.assertTrue(true);
	}
	@Test(priority = 3,dependsOnMethods = {"login"})
	void search() {
		System.out.println("search ...");
		Assert.assertTrue(false);
	}
	@Test(priority = 3,dependsOnMethods = {"login","search"})
	void advSearch() {
		System.out.println("ADV search ...");
		Assert.assertTrue(true);
	}
	@Test(priority = 5,dependsOnMethods = {"login"})
	void closeWeb() {
		System.out.println("close web");
		Assert.assertTrue(true);
	}

}
