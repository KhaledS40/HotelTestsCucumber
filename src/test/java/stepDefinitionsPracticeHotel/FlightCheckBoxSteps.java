package stepDefinitionsPracticeHotel;

import io.cucumber.java.en.*;
import practiceHotelPagF.FlightsCheckboxes;

import static baseTestPracticeH.MainTest.driver;

public class FlightCheckBoxSteps {

    FlightsCheckboxes checkboxes = new FlightsCheckboxes(driver);

    @Given("user click on {string} checkbox")
    public void user_click_on_roundTrip_checkbox(String roundTrip) {

        checkboxes.clickRoundTripBox();
    }
    @When("user select {string} checkbox")
    public void user_select_multiCity_checkbox(String multiCity) {

        checkboxes.clickMulticityBox();
    }
    @Then("user can now select {string} checkbox")
    public void user_can_now_select_Oneway_checkbox(String oneWay) {

        checkboxes.clickOneWayBox();
    }
    @Then("user should be able select {string} checkbox")
    public void user_should_be_able_to_select_FamilyAndFriends_checkbox(String FamilyAndFriends) {

        checkboxes.clickFamilyFriendsBox();
    }
    @Then("user click {string} checkbox")
    public void user_click_senior_checkbox(String senior) {

        checkboxes.clickSeniorCitizenBox();
    }
    @Then("user should be able to click {string} checkbox")
    public void user_should_be_able_to_click_IndianArmedForced_checkbox(String indianArmedForced) {

        checkboxes.clickIndianArmedForceBox();
    }
    @Then("user now can select the {string} checkbox")
    public void user__now_can_select_the_student_checkbox(String student) {

        checkboxes.clickStudentBox();
    }
    @Then("user finally can select the {string} checkbox")
    public void user_finally_can_select_the_UnaccompaniedMinor_checkbox(String unaccompaniedMinor){

        checkboxes.clickUnaccompaniedMinorBox();
        driver.close();
    }
}
