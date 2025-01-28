package stepDefinitionsHotelcom.shopTravel;

import hotel.comPageF.shopTravel.GroupsAndMeetingsLink;
import io.cucumber.java.en.*;
import static bastTestHotelCom.BaseTest.driver;

public class GroupsMeetingSteps {

    GroupsAndMeetingsLink groups;

    @When("user click Groups and Meetings link")
    public void user_click_groups_and_meetings_link(){

        groups = new GroupsAndMeetingsLink(driver);
        groups.clickGroupsAndMeetingsLink();
    }

    @When("user enters destination")
    public void user_enters_destination() {

        groups.enterDestination();
    }

    @When("user selects checkIn and checkOut dates")
    public void user_selects_check_in_and_check_out_dates() throws InterruptedException {

        groups.enterCheckInAndCheckOutDate();
    }

    @When("user select group type")
    public void user_select_group_type() {

        groups.selectGroupType();
    }

    @Then("user enter room rate per night")
    public void user_enter_room_rate_per_night() {

        groups.enterRatePerNight();
    }

    @Then("user select star rating")
    public void user_select_star_rating() {

        groups.selectStarRating();
    }

    @Then("now user can slide the night rate to the left")
    public void now_user_can_slide_the_night_rate_to_the_left() {

        groups.slideLeft();
    }

    @Then("user can alide the night rate to the right")
    public void user_can_alide_the_night_rate_to_the_right() {

        groups.slideRight();
    }

    @Then("at the end user can submit the form")
    public void at_the_end_user_can_submit_the_form() {

        groups.submitTheForm();
    }
}
