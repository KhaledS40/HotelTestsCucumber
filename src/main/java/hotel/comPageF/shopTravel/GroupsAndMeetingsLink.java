package hotel.comPageF.shopTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GroupsAndMeetingsLink {

    public WebDriver driver;

    public GroupsAndMeetingsLink(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[normalize-space()='Groups & meetings']")
    WebElement groupsAndMeetingsLink;

    @FindBy(css = "#txtCity1")
    WebElement destinationBox;

    @FindBy(css = "div[class='destination'] div")
    List<WebElement> locationName;

    @FindBy(css = "#CheckInDate1_disp")
    WebElement checkInBox;

    @FindBy(xpath = "//td[@data-handler='selectDay']/a[text()='20']")
    WebElement checkInDate;

    @FindBy(xpath = "//td[@data-handler='selectDay']/a[text()='30']")
    WebElement checkOutDate;

    @FindBy(css = "#groupType")   //Bus Tour
    WebElement groupType;

    @FindBy(css = "#rooms")
    WebElement roomPerNight;

    @FindBy(css = "button[class='star-rating']")  //
    WebElement starRating;

    @FindBy(css = "li[data-value='2.5']")
    WebElement ratings;

    @FindBy(xpath = "//*[@id='group-form-budget']/div/span[1]")
    WebElement slideLeft;

    @FindBy(xpath = "//*[@id='group-form-budget']/div/span[2]")
    WebElement slideRight;

    @FindBy(css = "button[name='step1']")
    WebElement continueButton;


    public void clickGroupsAndMeetingsLink(){

        groupsAndMeetingsLink.click();
    }
    public void enterDestination(){

        //destinationBox.click();
        destinationBox.sendKeys("London");
        for (WebElement location: locationName) {
            if (location.getText().equals("London")) {
                location.click();
                break;
            }
        }
    }
    public void enterCheckInAndCheckOutDate(){

        checkInBox.click();
        checkInDate.click();
        checkOutDate.click();
    }
    public void selectGroupType(){

        groupType.click();
        Select select = new Select(groupType);
        select.selectByVisibleText("Bus Tour");
    }
    public void enterRatePerNight(){

        roomPerNight.sendKeys("200");
    }
    public void selectStarRating(){

        starRating.click();
        ratings.click();
    }
    public void slideLeft(){

       Actions act = new Actions(driver);
        try {

            int xOffset = 50;
            int yOffset = 0;

            act.clickAndHold(slideLeft).moveByOffset(yOffset, xOffset).release().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void slideRight() {

        Actions act = new Actions(driver);
        try {

            int xOffset = 50;
            int yOffset = 0;
            act.clickAndHold(slideRight).moveByOffset(xOffset, yOffset).release().perform();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void submitTheForm(){

        continueButton.click();
    }
}
