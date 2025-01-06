package hotel.comPageF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[normalize-space()='Shop travel']")
    WebElement shopTravelLike;

    @FindBy(xpath = "//button[normalize-space()='English']")
    WebElement englishLink;

    @FindBy(xpath = "//a[normalize-space()='List your property']")
    WebElement listYourPropertyLink;

    @FindBy(xpath = "//a[normalize-space()='Support']")
    WebElement supportLink;

    @FindBy(xpath = "//a[normalize-space()='Trips']")
    WebElement tripsLink;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement signInLink;



    public void clickShopTravelLike(){

        shopTravelLike.click();
    }

    public void clickEnglishLink(){

        englishLink.click();
        driver.switchTo().alert().dismiss();
    }

    public void clickListYourPropertyLink(){

        listYourPropertyLink.click();
        String originalWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(originalWindow);
        driver.switchTo().defaultContent();
    }

    public void clickSupportLink(){

        supportLink.click();
    }

    public void clickTripsLink(){
        tripsLink.click();
        ///driver.switchTo().alert().dismiss();
    }
    public void clickSignInLink(){

        signInLink.click();
    }
}
