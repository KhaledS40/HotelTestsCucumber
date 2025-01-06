package practiceHotelPagF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class FlightsCheckboxes {

    WebDriver driver;
    public FlightsCheckboxes(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ctl00_mainContent_rbtnl_Trip_1")
    WebElement roundTripCheckBox;

    @FindBy(id = "ctl00_mainContent_rbtnl_Trip_2")
    WebElement multicityCheckBox;

    @FindBy(id = "ctl00_mainContent_rbtnl_Trip_0")
    WebElement oneWayCheckBox;

    @FindBy(id = "ctl00_mainContent_chk_friendsandfamily")
    WebElement familyAndFriendsBox;

    @FindBy(id = "ctl00_mainContent_chk_SeniorCitizenDiscount")
    WebElement seniorCitizenBox;

    @FindBy(id = "ctl00_mainContent_chk_IndArm")
    WebElement indianArmedForceBox;

    @FindBy(id = "ctl00_mainContent_chk_StudentDiscount")
    WebElement studentBox;

    @FindBy(id = "ctl00_mainContent_chk_Unmr")
    WebElement unaccompaniedMinorBox;


    public void clickRoundTripBox(){

        roundTripCheckBox.click();
    }

    public void clickMulticityBox(){

        multicityCheckBox.click();
        driver.findElement(By.id("MultiCityModelAlert")).click();

    }

    public void clickOneWayBox(){

        oneWayCheckBox.click();

    }

    public void clickFamilyFriendsBox(){

        familyAndFriendsBox.click();
    }

    public void clickSeniorCitizenBox(){

        seniorCitizenBox.click();

    }

    public void clickIndianArmedForceBox(){

        indianArmedForceBox.click();

    }

    public void clickStudentBox(){

        studentBox.click();
    }

    public void clickUnaccompaniedMinorBox(){

        unaccompaniedMinorBox.click();
        System.out.println("this is the last step");
    }
}
