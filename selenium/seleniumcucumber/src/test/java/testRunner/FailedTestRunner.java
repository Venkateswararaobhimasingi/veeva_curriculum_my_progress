package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed_scenarios.txt",  // ⭐ read failed cases
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/rerun-cucumber-report.html"
        },
        monochrome = true
)
public class FailedTestRunner {
}
