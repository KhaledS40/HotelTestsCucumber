package stepDefinitionsHotelcom.shopTravel;

import hotel.comPageF.shopTravel.CarsLink;
import io.cucumber.java.en.*;
import static bastTestHotelCom.BaseTest.driver;

public class CarsLInkSteps {

    //BaseTest base = new BaseTest();
    CarsLink cars;


    @Given("user click on the {string} link and navigates to the search page")
    public void user_click_on_the_Cars_link_and_navigates_to_the_search_page(String Cars) {

        cars = new CarsLink(driver);
        cars.clickCars();
    }
    @When("user choose pick up location")
    public void user_choose_pick_up_location() {

        cars.selectPickUpLocation();
    }
    @And("user select pick up and drop of dates")
    public void user_select_pickUp_and_DropOff_dates() throws InterruptedException {

        cars.selectPickUpAndDropOffDate();
    }
    @And("user choose drop off location")
    public void user_choose_drop_off_location() {

        cars.selectDropOffLocation();
    }
    @Then("user select pick up time")
    public void user_select_pick_up_time() {

        cars.selectPickUpTime();
    }
    @And("user select drop off time")
    public void user_select_drop_off_time() {

        cars.selectDropOffTime();
    }
    @And("user click to display discount code")
    public void user_click_to_display_discount_code() {

        cars.clickDiscountLink();
    }
    @And("user can finally select brand of the car")
    public void user_can_finally_select_brand_of_the_car() {

        cars.selectRentalCarBrand();
    }
    @And("user hit the search button to get the search results for his selection")
    public void user_hit_the_search_button_to_get_the_search_results_for_his_her_selection() {

        cars.clickSearchButton();

    }
}
