package hotel.comPageF.shopTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CarsLink {

    public WebDriver driver;

    public CarsLink(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[contains(text(),'Cars')]")
    WebElement carsLink;

    @FindBy(css = "button[aria-label='Pick-up']")
    WebElement pickUpLocationField;

    @FindBy(css = "#location-field-locn")
    WebElement textAreaPickUp;

    //to use FindElements for a collection of elements, you have to get an element that matching for multiple links then store it as list webElement as follows
    @FindBy(css = "li[class='uitk-action-list-item uitk-typeahead-result-item has-subtext uitk-action-list-item-relaxed'] div")
    List<WebElement> locationOptionsPickUp;

    @FindBy(css = "#d1-btn")
    WebElement caledarIcon;

    @FindBy(xpath = "//*[@id='wizard-car-pwa-1']/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[4]")
    WebElement pickUpDate;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement doneButton;

    @FindBy(css = "#d2-btn")
    WebElement calendarIcon2;

    @FindBy(xpath = "//*[@id='wizard-car-pwa-1']/div[2]/div[1]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr[3]/td[1]")
    WebElement dropOffDate;

    @FindBy(xpath = "//button[normalize-space()='Done']")
    WebElement doneButton2;

    @FindBy(css = "button[aria-label='Same as pick-up']")
    WebElement dropOffLocationField;

    @FindBy(css = "#location-field-loc2")
    WebElement textAreaDropOff;

    @FindBy(css = "li[class='uitk-action-list-item uitk-typeahead-result-item has-subtext uitk-action-list-item-relaxed'] div")
    List<WebElement> locationsOptionDropOfF;

    @FindBy(css = "select[aria-label='Pick-up time']")
    WebElement pickUpTime;

    @FindBy(css = "select[aria-label='Drop-off time']")
    WebElement dropOffTime; // 4:00 am

    @FindBy(css = ".uitk-expando-title")
    WebElement discountCodeExpand;

    @FindBy(css = "select[aria-label='Preferred brand']")
    WebElement brandSelection;
    //Budget
    @FindBy(css = "button[type='submit']")
    WebElement searchButton;



    public void clickCars(){

        carsLink.click();
    }

    public void selectPickUpLocation(){

        pickUpLocationField.click();
        textAreaPickUp.sendKeys("Key");
        for (WebElement location : locationOptionsPickUp) {

            if (location.getText().contains("Key West")) {
                location.click();
                break;
            }

        }

        System.out.println("this is after selecting the location");
    }

    public void selectPickUpAndDropOffDate(){

        caledarIcon.click();
        pickUpDate.click();
        doneButton.click();
        calendarIcon2.click();
        dropOffDate.click();
        doneButton2.click();
    }

    public void selectDropOffLocation(){

        dropOffLocationField.click();
        textAreaDropOff.sendKeys("Los");
        for (WebElement locations: locationsOptionDropOfF){

            if (locations.getText().contains("Los Angeles")){
                locations.click();
                break;
            }
        }

        System.out.println("this is after selecting the location");
        //Los Angeles (LAX - Los Angeles Intl.) California, United States;
    }

    public void selectPickUpTime(){

        pickUpTime.click();
        Select s = new Select(pickUpTime);
        s.selectByVisibleText("12:30 am");
    }

    public void selectDropOffTime(){

        dropOffTime.click();
        Select select = new Select(dropOffTime);
        select.selectByVisibleText("3:00 am");
    }

    public void clickDiscountLink(){

        discountCodeExpand.click();
    }

    public void selectRentalCarBrand(){

        brandSelection.click();
        Select s = new Select(brandSelection);
        s.selectByVisibleText("Budget");
    }

    public void clickSearchButton(){

        searchButton.click();
    }
}
