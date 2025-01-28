package hotel.comPageF.shopTravel;

import com.aventstack.extentreports.util.Assert;
import io.reactivex.rxjava3.core.Completable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GiftCardsLink {

    public WebDriver driver;

    public GiftCardsLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*
    Using @FindBy to store elements
     */

//    @FindBy(xpath = "//div[contains(text(),'Gift Cards')]")
//    WebElement giftCardsLink;

    @FindBy(css = ".uitk-text.uitk-type-300.uitk-text-standard-theme")
    List<WebElement> shopTravelLinks;  // Gift Cards

    @FindBy(xpath = "//a[normalize-space()='Buy Now']")
    WebElement buyNowButton;

    @FindBy(css = "#recipientName-input")
    WebElement theirNameBox;

    @FindBy(css = "#senderName-input")
    WebElement yourNameBox;

    @FindBy(css = "button[type='submit']")
    WebElement pickGiftCardDesign;

    @FindBy(xpath = "//*[@id='app-root']/div/main/div/form/section/div[1]/button")
    WebElement digitalCard;

    @FindBy(css = "#selectedGroupOrdinal-1-label")
    WebElement holidaysDesign;

    @FindBy(css = "button[aria-label='Next card design']")
    WebElement nextArrow;

    @FindBy(css = "div[aria-label='Hanukkah, Snowy']")
    WebElement giftCardPick;

    @FindBy(id = "truste-consent-button")
    WebElement acceptAllCookies;

    @FindBy(css = "button[type='submit']")
    WebElement howMuchButton;

    @FindBy(css = "button[aria-label='Increment amount'] svg g path")  // css = #amount-5  amountType
    WebElement incrementSign;

    @FindBy(css = "button[aria-label='Increment quantity']")
    WebElement addQuantity;

    @FindBy(css = "button[type='submit']")
    WebElement addMessageButton;

    @FindBy(css = "#message-input")
    WebElement messageBox;

    @FindBy(css = "button[type='submit']")
    WebElement whereIsItGoingButton;

    @FindBy(css = "#recipientEmail-input")
    WebElement recipientEmail;

    @FindBy(css = "#recipientEmailConfirmation-input")
    WebElement confirmRecipientEmail;

    @FindBy(css = "#deliveryDate-input")
    WebElement deliveryCalendar;

    @FindBy(css = "td[aria-label='Thursday, January 30, 2025']")
    WebElement deliveryDate;

    @FindBy(css = "button[class='btn-link btn-link--center'] span")
    WebElement sendAtSpecificTimeLink;

    @FindBy(css = "#hour-input")  // 4
    WebElement hourInput;

    @FindBy(css = "#minute-input") // 30
    WebElement minuteInput;

    @FindBy(css = "#meridiem-input") // AM
    WebElement AMAndPM;

    @FindBy(css = "#sendTimezone-input")
    WebElement TimeZoneBox;

    @FindBy(css = "button[type='submit']")
    WebElement addToCardButton;

    @FindBy(xpath = "//span[normalize-space()='Order Summary']")  // Order Summary
    WebElement orderSummaryText;

    @FindBy(css = ".btn.btn--primary")
    WebElement checkOutButton;

    @FindBy(xpath = "//span[normalize-space()='Order Total']")  // Order Total
    WebElement orderTotal;


    public void clickGiftCards(){

        try{
        for (WebElement element : shopTravelLinks) {
            if (element.getText().equals("Gift Cards")) {
                element.click();
                break;
            }
        }
        } catch ( Exception e){
            e.printStackTrace();
        }
    }
    public void clickBuyNow(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", buyNowButton);
        buyNowButton.click();
    }
    public void enterRecipientAndSenderName(){

        theirNameBox.sendKeys("Bob");
        yourNameBox.sendKeys("John");
    }
    public void clickPickGiftCard(){

        pickGiftCardDesign.click();
    }
    public void selectTypesCard(){

        digitalCard.click();
    }
    public void clickHolidaysType(){

        holidaysDesign.click();
    }
    public void selectCardDesign(){

        driver.manage().deleteAllCookies();
        giftCardPick.click();
    }
    public void clickHowMuch(){

        acceptAllCookies.click();
        howMuchButton.click();
    }
    public void addDollarsAmount(){

        try{
            for (int i=0; i>4; i++){
                incrementSign.click();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void setQuantityOfCards(){

        addQuantity.click();
    }
    public void addMessageToCard(){

        addMessageButton.click();
        messageBox.sendKeys("You are my special person");
        whereIsItGoingButton.click();
    }
    public void selectDeliveryTypeAndEnterRecipientEmail(){

        recipientEmail.sendKeys("bob.john@gmail.com");
        confirmRecipientEmail.sendKeys("bob.john@gmail.com");
    }
    public void selectDeliveryDate(){

        deliveryCalendar.click();
        deliveryDate.click();
    }
    public void selectTimeZone(){

        sendAtSpecificTimeLink.click();

        hourInput.click();
        Select select = new Select(hourInput);
        select.selectByVisibleText("4");
    }
    public void selectHourZone(){

        minuteInput.click();
        Select select = new Select(minuteInput);
        select.selectByVisibleText("30");
    }
    public void selectAMPMType(){

        AMAndPM.click();
        Select select = new Select(AMAndPM);
        select.selectByVisibleText("AM");
        TimeZoneBox.sendKeys("DC - EST");
        addToCardButton.click();
    }
    public void verifyTransaction(){

        String orderText= orderSummaryText.getText();
        String text = "Order Summary";
        if (orderText ==text){
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }

    }
    public void clickCheckout(){

        checkOutButton.click();
        String order = orderTotal.getText();
        String expectedText = "Order Total";
        if (expectedText ==order){
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
