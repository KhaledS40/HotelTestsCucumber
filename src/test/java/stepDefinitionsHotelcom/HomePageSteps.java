package stepDefinitionsHotelcom;


import bastTestHotelCom.BaseTest;
import io.cucumber.java.en.*;
import hotel.comPageF.HomePage;

import java.io.IOException;

import static bastTestHotelCom.BaseTest.driver;

public class HomePageSteps{

    HomePage home;
    BaseTest base = new BaseTest();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() throws IOException {

        base.WebDriverInit();
    }

    @When("user click on {string} Travel link")
    public void user_click_on_travel_link(String shopLink) {

        home = new HomePage(driver);
        home.clickShopTravelLike();
    }

    @When("user click on {string} link")
    public void user_click_on_link(String propertyLink) {

        home.clickListYourPropertyLink();
    }

    @Then("user should be able to click {string} link")
    public void user_should_be_able_to_click_link(String supportLink) {

        home.clickSupportLink();
    }

    @Then("user should click on {string} link")
    public void user_should_click_on_link(String tripsLink) {

        home.clickTripsLink();
    }

    @And("finally browser should be closed")
    public void finally_browser_should_be_closed(){

        base.tearDown();
    }
}
