package baseTestPracticeH;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class MainTest {

    public static WebDriver driver;
    public void DriverInit(){

        WebDriverManager.edgedriver().setup();
//        EdgeOptions options = new EdgeOptions();
//        options.addArguments("head--less");
//        driver = new EdgeDriver(options);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
    }

    public void tearDown(){

        driver.close();
    }
}
