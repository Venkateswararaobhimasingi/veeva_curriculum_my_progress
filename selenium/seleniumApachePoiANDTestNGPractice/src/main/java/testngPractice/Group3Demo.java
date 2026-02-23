package testngPractice;

import org.testng.annotations.Test;

public class Group3Demo {
	
	@Test(priority = 1,groups = {"sanity","regression","functional"})
	void payInCash() {
		System.out.println("pay in cash ...");
	}
	@Test(priority = 2,groups = {"sanity","regression","functional"})
	void payInPhonePay() {
		System.out.println("pay in phonepay ...");
	}

}
