package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)    //dependence injection is add by cucumber-picocontainer here add by the package

@CucumberOptions(
		features = ".//Features//AddUserInOrange.feature",
		glue = "stepDefinitions",
		//dryRun = true,
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumberOrangeAdduser-report.html", "rerun:target/failed_scenarios.txt" } )
public class AddUserTestrun {

}
