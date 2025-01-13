package hotel.comPageF.shopTravel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DealsLink {

    public WebDriver driver;

    public DealsLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//a[@aria-label='Deals']")
    WebElement dealsLink;

    @FindBy(css = "button[aria-label='Where to?']")
    WebElement whereTo;

    @FindBy(css = "#destination_form_field")
    WebElement whereToTextBox;

    @FindBy(css = "li[class='uitk-action-list-item uitk-action-list-item-relaxed'] div")
    List<WebElement> placeOptions; //Atlanta Georgia, United States

    @FindBy(name = "EGDSDateRange-date-selector-trigger")
    WebElement calendarIcon;

    @FindBy(xpath = "(//div[@role='button'])[10]")
    WebElement dateFrom;

    @FindBy(xpath = "(//div[@role='button'])[20]")
    WebElement dateTo;

    @FindBy(css = ".uitk-button.uitk-button-medium.uitk-button-has-text.uitk-button-primary.uitk-layout-flex-item")
    WebElement DONE;

    @FindBy(css = "div[class='uitk-menu uitk-menu-mounted'] div[class='uitk-field has-floatedLabel-label has-icon has-placeholder']")
    WebElement travlersSelection;

    @FindBy(css = "svg[aria-label='Increase the number of adults in room 1']")
    WebElement adultsAdd;

    @FindBy(css = "svg[aria-label='Increase the number of children in room 1']")
    WebElement childrenAdd;

    @FindBy(css = "#age-traveler_selector_children_age_selector-0-0")
    WebElement childDropDown;  //2

    @FindBy(css = "#traveler_selector_done_button")
    WebElement doneButton;



    public void clickDealsLink(){

        dealsLink.click();
    }

    public void ClickAndEnterTextWhereToBoxAndSelectLocation(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", whereTo);

        whereTo.click();
        whereToTextBox.sendKeys("Atl");
        for (WebElement place: placeOptions){
            if (place.getText().contains("Atlanta Georgia")){
                place.click();
                break;
            }
        }
    }

    public void selectDates(){

        calendarIcon.click();
        dateFrom.click();
        dateTo.click();
        DONE.click();
    }

    public void clickTravelers(){

        travlersSelection.click();
    }

    public void addTravelers(){

        adultsAdd.click();
        childrenAdd.click();
        childDropDown.click();
        Select s = new Select(childDropDown);
        s.selectByIndex(2);
    }

    public void clickDoneButton(){

        doneButton.click();
    }
}
