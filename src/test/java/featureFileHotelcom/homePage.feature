Feature: User can navigate to Hotel.com homepage

  @homepage
  Scenario: User navigate to links on the homepage and verify links

    Given user is on the homepage
    When user click on "Shop" Travel link
    And user click on "List Your Property" link
    Then user should be able to click "Support" link
    And user should click on "Trips" link
    And finally browser should be closed


