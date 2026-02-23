package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

 @CucumberOptions(
		features = ".//Features//OrangeLogin.feature",
		glue = "stepDefinitions",
		//dryRun = true,
		dryRun = false,
		monochrome = true,
		plugin = { "pretty","html:target/OrangeLoginReport.html"} ) 

/*@CucumberOptions(
		features = ".//Features/",
		glue = "stepDefinitions",
		//dryRun = true,
		dryRun = false,
		monochrome = true,
		plugin = { "pretty","html:target/OrangeLoginReport.html"},
		tags = "@sanity" )
*/
//tags = "@sanity or @regression"
public class OrangeTestRun {

}
