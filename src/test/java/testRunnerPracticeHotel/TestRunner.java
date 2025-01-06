package testRunnerPracticeHotel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFilePracticeHotel", glue = {"stepDefinitionsPracticeHotel"}, monochrome = true,
plugin = {"pretty" ,"html:target/cucumber-report"}, tags = "@checkboxes")
public class TestRunner {
}
