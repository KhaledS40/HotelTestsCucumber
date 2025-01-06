package stepDefinitionsHotelcom.shopTravel;

import hotel.comPageF.shopTravel.DealsLink;
import io.cucumber.java.en.*;
import static bastTestHotelCom.BaseTest.driver;

public class DealsLinkSteps {

    DealsLink deals;

    @When("user click on Deals link")
    public void user_click_on_deals_link() {

        deals = new DealsLink(driver);
        deals.clickDealsLink();
    }
    @And("user can select location where to go")
    public void user_can_select_location_where_to_go() {

        deals.ClickAndEnterTextWhereToBoxAndSelectLocation();
    }
    @And("user also can pick dates")
    public void user_also_can_pick_dates() {

        deals.selectDates();
    }
    @Then("user can add adults travelers")
    public void user_can_add_adults_travelers() {

        deals.clickTravelers();
    }
    @And("user also can add children as many as they can")
    public void user_also_can_add_children_as_many_as_they_can() {

        deals.addTravelers();
    }
    @And("finally user click {string} button after completing selection")
    public void finally_user_click_button_after_completing_selection(String Done) {

        deals.clickDoneButton();
    }
}
