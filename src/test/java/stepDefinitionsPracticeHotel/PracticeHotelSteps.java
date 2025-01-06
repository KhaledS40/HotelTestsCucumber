package stepDefinitionsPracticeHotel;

import baseTestPracticeH.MainTest;
import io.cucumber.java.en.*;
import practiceHotelPagF.SelectCityAndDate;
import static baseTestPracticeH.MainTest.driver;


public class PracticeHotelSteps {

    SelectCityAndDate selectCity;
    MainTest main = new MainTest();

    @Given("user navigate to landing page")
    public void user_navigate_to_landing_page() {

        main.DriverInit();
        //selectCity = new SelectCityAndDate(driver);
    }

    @When("user enter key word for a country")
    public void user_enter_key_word_for_a_country() {

        selectCity = new SelectCityAndDate(driver);
        selectCity.enterCountryKeys();
    }

    @And("user select a country")
    public void user_select_a_country() {

        selectCity.selectCountryOptions();
    }

//    @When("user select {string} option")
//    public void user_select_option(String checkBox) {
//
//        selectCity.clickOnWayCheckBox();
//    }

    @And("user select Round Trip options")
    public void user_select_round_trip_options(){

        selectCity.selectRoundTripOption();
    }

    @Then("user click on dropdown")
    public void user_click_on_dropdown() {

        selectCity.clickDropdownFrom();
    }

    @And("user can select city from")
    public void user_can_select_city_from() {

        selectCity.selectCityFrom();
    }
    @And("user click on second dropdown")
    public void user_click_on_second_dropdown() {

        selectCity.clickDropdownTo();
    }

    @And("user then select city TO")
    public void user_then_select_city_to() {

        selectCity.selectCityTo();

    }

    @And("user select depart date")
    public void user_select_depart_date(){

        selectCity.selectDepartDate();
    }

    @And("user now can click on {string} icon")
    public void user_now_can_click_on_icon(String calendar) {

        selectCity.clickCalendarIcon();
    }

    @And("user can select return date")
    public void user_can_select_return_date() {

        selectCity.selectReturnDate();

    }

    @And("user click on {string} dropdown")
    public void user_click_on_passenger_dropdown(String Passenger){

        selectCity.clickPassengerDropdown();
    }

    @And("user add passenger number")
    public void user_add_passenger(){

        selectCity.addPassenger();
    }

    @And("user add child passenger")
    public void user_add_child_passenger(){

        selectCity.AddChild();
    }

    @And("user click on {string} dropdown and select currency")
    public void user_click_on_currency_dropdown_and_select_currency(String currency){

        selectCity.clickCurrencyDropdown();
    }

    @And("user finally can hit the search button to get the result")
    public void user_finally_can_hit_the_search_button(){

        selectCity.clickSearchButton();
        System.out.println("this is the last step");
        main.tearDown();
    }
}
