package hotel.comPageF.shopTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsLink {

    public WebDriver driver;

    public GiftCardsLink(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*
    Using @FindBy to store elements
     */

    @FindBy(xpath = "//div[normalize-space()='Gift Cards']")
    WebElement giftCardsLink;

    @FindBy(xpath = "//a[normalize-space()='Buy Now']")
    WebElement buyButton;

    @FindBy(css = "#recipientName-input")
    WebElement theirNameBox;

    @FindBy(css = "#senderName-input")
    WebElement yourNameBox;

    @FindBy(css = "button[type='submit']")
    WebElement pickGiftCardDesign;

    @FindBy(css = "#selectedGroupOrdinal-1-label")
    WebElement holidaysDesign;

    @FindBy(css = "button[aria-label='Next card design']")
    WebElement nextArrow;

    @FindBy(css = "#fp-8")
    WebElement giftCardPick;

    @FindBy(css = "button[type='submit']")
    WebElement howMuchButton;

    @FindBy(css = "button[aria-label='Increment amount'] svg g path")  // css = #amount-5  amountType
    WebElement incrementSign;

    @FindBy(css = "button[aria-label='Increment quantity']")
    WebElement addQuantiy;

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

    @FindBy(css = "td[aria-label='Monday, January 20, 2025']")
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

    @FindBy(css = "//span[normalize-space()='Order Total']")  // Order Total
    WebElement orderTotal;


}
