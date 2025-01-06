Feature: Selecting country and city for One Way flight

  Background:
    Given user navigate to landing page

  @selectCity
  Scenario: User can select Country and City to fly From to To

    Given user enter key word for a country
    When user select a country
    And user select Round Trip options
    #And user select "One way" option
    Then user click on dropdown
    And user can select city from
    And user click on second dropdown
    And user then select city TO
    And user select depart date
    And user now can click on "Calendar" icon
    And user can select return date
    And user click on "Passenger" dropdown
    And user add passenger number
    And user add child passenger
    And user click on "Currency" dropdown and select currency
    And user finally can hit the search button to get the result

  @checkboxes
  Scenario: User is able to select the checkboxes

    Given user click on "RoundTrip" checkbox
    When user select "MultiCity" checkbox
    Then user can now select "Oneway" checkbox
    And user should be able select "FamilyAndFriends" checkbox
    And user click "Senior" checkbox
    And user should be able to click "IndianArmedForces" checkbox
    And user now can select the "Student" checkbox
    And user finally can select the "UnaccompaniedMinor" checkbox


