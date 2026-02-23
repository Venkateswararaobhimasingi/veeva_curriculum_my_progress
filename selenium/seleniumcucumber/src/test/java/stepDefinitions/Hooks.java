package stepDefinitions;

import io.cucumber.java.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.*;
import utilities.ExtentManager;

public class Hooks {

    BaseClass con;

    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // PicoContainer Injection
    public Hooks(BaseClass con) {
        this.con = con;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        con.log.info("========== START SCENARIO: " + scenario.getName() + " ==========");

        ExtentTest scenarioTest = extent.createTest(scenario.getName());
        test.set(scenarioTest);
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Timestamp
                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

                // Clean scenario name
                String scenarioName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_");

                // File name
                String fileName = scenarioName + "_" + timeStamp + ".png";
                String filePath = System.getProperty("user.dir") + "/target/screenshots/" + fileName;

                // Capture screenshot
                File src = ((TakesScreenshot) con.driver).getScreenshotAs(OutputType.FILE);
                File dest = new File(filePath);
                dest.getParentFile().mkdirs();
                Files.copy(src.toPath(), dest.toPath());

                // Attach to Cucumber report
                byte[] screenshotBytes = Files.readAllBytes(dest.toPath());
                scenario.attach(screenshotBytes, "image/png", fileName);

                // Attach to Extent report
                String base64 = Base64.getEncoder().encodeToString(screenshotBytes);
                test.get().fail("Step Failed",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build());

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            test.get().pass("Step Passed");
        }
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            test.get().fail("Scenario Failed: " + scenario.getName());
        } else {
            test.get().pass("Scenario Passed: " + scenario.getName());
        }

        extent.flush();
        con.driver.quit();
    }
}