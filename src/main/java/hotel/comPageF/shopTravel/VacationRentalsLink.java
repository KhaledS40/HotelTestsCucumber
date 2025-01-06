package hotel.comPageF.shopTravel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class VacationRentalsLink {

    public WebDriver driver;

    /*
        Method is used to call the find the elements using initElements methods using PageFactory class and is the constructor of the class
     */
    public VacationRentalsLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Vacation rentals')]")
    WebElement vacationRentalsLink;

    @FindBy(css = "button[aria-label='Going to']")
    WebElement goingToTextBox;

    @FindBy(css = "#location-field-destination")
    WebElement fieldDestination;

    @FindBy(css = "li[class='uitk-action-list-item uitk-typeahead-result-item has-subtext uitk-action-list-item-relaxed'] div")
    List<WebElement> locationsOption ; //

    @FindBy(xpath = "//*[@id='wizard-vr-pwa-1']/div/div[2]/div/div/div[1]/div/div")
    WebElement checkInDateBox;

    @FindBy(css = "button[aria-label='Dec 20, 2024']")
    WebElement checkInDate;

    @FindBy(css = "button[aria-label='Save changes and close the date picker.']")
    WebElement doneButton1;

    @FindBy(xpath = "//*[@id='wizard-vr-pwa-1']/div/div[2]/div/div/div[2]/div/div")
    WebElement checkOutDateBox;

    @FindBy(css = "button[aria-label='Jan 20, 2025']")
    WebElement checkOutDate;

    @FindBy(css = "button[aria-label='Save changes and close the date picker.']")
    WebElement doneButton2;

    @FindBy(css = "#adaptive-menu")
    WebElement guestSelection;

    @FindBy(xpath = "//*[@id='adaptive-menu']/div[2]/div/div/div[2]/section/div[1]/div[2]/div[1]/button[2]")
    WebElement addGuest;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement doneButton3;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;



    public void clickVacationRentalsLink(){

        vacationRentalsLink.click();
    }

    public void enterLocation(){

        goingToTextBox.click();
        fieldDestination.sendKeys("FL");
        try {
            for (WebElement location: locationsOption){
                if (location.getText().contains("Fort Lauderdale")){
                    location.click();
                }

            }
        } catch (org.openqa.selenium.StaleElementReferenceException e){
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(checkInDateBox));

        }
    }

    public void selectCheckInDate(){

        checkInDateBox.click();
        checkInDate.click();
        doneButton1.click();
    }

    public void selectCheckOutDate(){

        checkOutDateBox.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        checkOutDate.click();
        doneButton2.click();
    }

    public void selectGuest(){

        guestSelection.click();
        addGuest.click();
        //doneButton3.click();

//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//            doneButton3.click();
//        } catch (org.openqa.selenium.ElementNotInteractableException: searchButton)
//
    }

    public void clickSearch(){

        searchButton.click();
    }
}
