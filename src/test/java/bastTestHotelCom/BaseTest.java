package bastTestHotelCom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void WebDriverInit(){

        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("head--less");
        driver = new EdgeDriver(options);
        //driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.hotels.com/");
            System.out.println("Before test");
    }

    @BeforeTest(alwaysRun = true)
    public void tearDown(){

        driver.quit();
            System.out.println("After test");
    }
}
