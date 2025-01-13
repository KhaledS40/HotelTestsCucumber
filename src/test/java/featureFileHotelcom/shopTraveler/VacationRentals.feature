Feature: Using Search navigation to find places

  @vacationRentals
  Scenario: User can search for locations and dates to vacation

    Given user is on the homepage
    And user click on "Shop" Travel link
    When user click "VacationRentals" link
    And user navigate to "Search vacation rentals" page and select location where to go
    Then user should select check in date
    And user should select check out date
    And user can select number of adults and children travellers
    And finally user click search button to get the search results
    And finally browser should be closed
