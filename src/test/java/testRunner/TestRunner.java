package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFileHotelcom", glue = {"stepDefinitionsHotelcom"}, monochrome = true
        , plugin = {"pretty" ,"html:target/cucumber-report"}, tags = "@giftCards")
public class TestRunner {
}
