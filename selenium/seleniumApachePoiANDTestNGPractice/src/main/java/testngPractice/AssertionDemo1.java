package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 {
	@Test
	void testTitle() {
		String act_title="venkat";
		String exp_title="venkatesh";
		
		//here if condition is not working to find really the test is fail
		
		//for that Assertion can made correctly vaildated 
		
		Assert.assertEquals(act_title, exp_title);
		
		if(act_title.equals(exp_title)) {
			System.out.println("pass ...");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("fail ...");
		}
	}

}
