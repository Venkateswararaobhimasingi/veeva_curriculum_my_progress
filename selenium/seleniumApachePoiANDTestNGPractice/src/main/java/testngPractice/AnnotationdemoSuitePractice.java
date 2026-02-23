package testngPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AnnotationdemoSuitePractice {
	@BeforeSuite
	void bs() {
		System.out.print("before suite...");
	}
	@AfterSuite
	void as() {
		System.out.print("After suite...");
	}
	
	

}
