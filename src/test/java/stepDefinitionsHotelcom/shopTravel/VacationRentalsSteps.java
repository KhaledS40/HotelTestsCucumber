package stepDefinitionsHotelcom.shopTravel;

import hotel.comPageF.shopTravel.VacationRentalsLink;
import io.cucumber.java.en.*;
import static bastTestHotelCom.BaseTest.driver;

public class VacationRentalsSteps {

    VacationRentalsLink vacation;

    @When("user click {string} link")
    public void user_click_link(String string) {

        vacation = new VacationRentalsLink(driver);
        vacation.clickVacationRentalsLink();
    }

    @When("user navigate to {string} page and select location where to go")
    public void user_navigate_to_page_and_select_location_where_to_go(String string) {

        vacation.enterLocation();
    }

    @Then("user should select check in date")
    public void user_should_select_check_in_date() throws InterruptedException {

        vacation.selectCheckInDate();
    }

    @Then("user should select check out date")
    public void user_should_select_check_out_date() throws InterruptedException {

        vacation.selectCheckOutDate();
    }

    @Then("user can select number of adults and children travellers")
    public void user_can_select_number_of_adults_and_children_travellers() {

        vacation.selectGuest();
    }

    @Then("finally user click search button to get the search results")
    public void finally_user_click_search_button_to_get_the_search_results() {

        vacation.clickSearch();
    }
}
