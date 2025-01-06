Feature: User can navigate through Shop Travel tab and search for his reservation

  @cars
  Scenario: Cars link should be functional and display proper data

    Given user is on the homepage
    And user click on "Shop" Travel link
    And user click on the "Cars" link and navigates to the search page
    When user choose pick up location
    And user select pick up and drop of dates
    And user choose drop off location
    Then user select pick up time
    And user select drop off time
    And user click to display discount code
    And user can finally select brand of the car
    And user hit the search button to get the search results for his selection
    And finally browser should be closed