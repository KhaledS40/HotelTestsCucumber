package stepDefinitionsHotelcom.shopTravel;

import hotel.comPageF.shopTravel.GiftCardsLink;
import io.cucumber.java.en.*;
import static bastTestHotelCom.BaseTest.driver;

public class GiftCardsSteps {

    GiftCardsLink gifts;

    @When("user click on GiftCard link")
    public void user_click_on_gift_card_link() {

        gifts = new GiftCardsLink(driver);
        gifts.clickGiftCards();
    }
    @And("user slide down the page and click {string} button")
    public void user_slide_down_the_page_and_click_button(String BuyNow) {

        gifts.clickBuyNow();
    }
    @And("user enter recipient and your name")
    public void user_enter_recipient_and_your_name() {

        gifts.enterRecipientAndSenderName();
    }
    @And("user click pick a gift card button")
    public void user_click_giftCard_button() {

        gifts.clickPickGiftCard();
    }
    @And("user select types of cards {string}")
    public void user_select_types_of_cards(String digitalCard) {

        gifts.selectTypesCard();
    }
    @Then("user select {string} type")
    public void user_select_holidays_type(String holidays) {

        gifts.clickHolidaysType();
    }
    @And("user select card design")
    public void user_select_card_design() {

        gifts.selectCardDesign();
    }
    @And("user click {string} button")
    public void user_click_howMuch_button(String howMuch) {

        gifts.clickHowMuch();
    }
    @And("user add extra amount in the card")
    public void user_add_extra_amount_in_the_card() {

        gifts.addDollarsAmount();
    }
//    @And("user select a specific amount to add to the card")
//    public void user_select_a_specific_amount_to_add_to_the_card() {
//
//        gifts.selectDeliveryDate();
//    }
    @And("user can add quantity of the cards")
    public void user_can_add_quantity_of_the_cards() {

        gifts.setQuantityOfCards();
    }
    @And("user now add a message to the card if he or she wants to where it is going")
    public void user_now_add_a_message_to_the_card_if_he_or_she_wants_to_where_it_is_going() {

        gifts.addMessageToCard();
    }
    @And("user can now select types of delivery and also enter and confirm recipient email")
    public void user_can_now_select_types_of_delivery_and_enter_and_confirm_recipient_email() {

        gifts.selectDeliveryTypeAndEnterRecipientEmail();
    }
    @And("user select date of delivery")
    public void user_select_date_of_delivery() {

        gifts.selectDeliveryDate();
    }
    @And("user select a specific time zone")
    public void user_select_a_specific_time_zone() {

        gifts.selectTimeZone();
        gifts.selectHourZone();
        gifts.selectAMPMType();
    }
    @And("now user verify the transaction in the card")
    public void now_user_verify_the_transaction_in_the_card() {

        gifts.verifyTransaction();
    }
    @And("finally user click {string} button to complete the transaction")
    public void finally_user_click_checkout_button_to_complete_the_transaction(String checkout) {

        gifts.clickCheckout();
    }
}
