package practiceHotelPagF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectCityAndDate {

    WebDriver driver;
    public SelectCityAndDate(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "autosuggest")
    WebElement countrySelect;

    @FindBy(css ="li[class ='ui-menu-item'] a")
    List<WebElement> countryListOptions;

//    @FindBy(css = "#ctl00_mainContent_rbtnl_Trip_0")
//    private WebElement oneWayCheckbox;

    @FindBy(id = "ctl00_mainContent_rbtnl_Trip_1")
    WebElement roundTripOption;

    @FindBy(css = "#ctl00_mainContent_ddl_originStation1_CTXTaction")
    WebElement dropdownClick1;

    @FindBy(xpath = "//a[normalize-space()='Bengaluru (BLR)']")
    WebElement citySelectionsFrom;

    @FindBy(css = "#ctl00_mainContent_ddl_destinationStation1_CTXTaction")
    WebElement dropdownClick2;

    @FindBy(xpath = "(//a[contains(text(),'Chennai (MAA)')])[2]")
    WebElement citySelectionTo;

    @FindBy(xpath = "//a[normalize-space()='20']")
    WebElement departDate;

    @FindBy(css = "div[id='Div1'] button[type='button']")
    WebElement calendarIconReturn;

    @FindBy(xpath = "//a[@class='ui-state-default'][normalize-space()='20']")
    WebElement selectReturnDate;

    @FindBy(id = "divpaxinfo")
    WebElement passengersDropdown;

    @FindBy(id = "hrefIncAdt")
    WebElement addPassenger;

    @FindBy(id = "hrefIncChd")
    WebElement addChild;

    @FindBy(id = "ctl00_mainContent_DropDownListCurrency")
    WebElement currencyDropdown;

//    @FindBy(id = "USD")
//    WebElement currencySelect;

    @FindBy(id = "ctl00_mainContent_btn_FindFlights")
    WebElement searchButton;


    public void enterCountryKeys(){

        countrySelect.sendKeys("Ind");

    }

    public void selectCountryOptions(){

        for (WebElement options: countryListOptions){
            if (options.getText().equalsIgnoreCase("India")){

                options.click();
                break;
            }
        }
    }

//    public void clickOnWayCheckBox(){
//
//        //oneWayCheckbox.isSelected();
//        System.out.println(oneWayCheckbox.isSelected());
//    }

    public void selectRoundTripOption(){

        roundTripOption.click();
    }

    public void clickDropdownFrom(){

        dropdownClick1.click();
    }

    public void selectCityFrom(){

        citySelectionsFrom.click();
    }

    public void clickDropdownTo(){

        dropdownClick2.click();
    }

    public void selectCityTo(){

        citySelectionTo.click();
    }

    public void selectDepartDate(){

        departDate.click();
    }

    public void clickCalendarIcon(){

        calendarIconReturn.click();
    }

    public void selectReturnDate(){

        selectReturnDate.click();
    }

    public void clickPassengerDropdown(){

        passengersDropdown.click();
    }

    public void addPassenger(){

        addPassenger.click();
    }

    public void AddChild(){

        addChild.click();
    }

    public void clickCurrencyDropdown(){

        currencyDropdown.click();
        Select select = new Select(currencyDropdown);
        select.selectByVisibleText("USD");
    }

    public void clickSearchButton(){

        searchButton.click();
    }
}
