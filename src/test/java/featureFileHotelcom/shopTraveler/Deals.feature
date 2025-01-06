Feature: Navigate to add travelers and child to the list

  @deals
  Scenario: User can add more travelers and children to their trip

    Given user is on the homepage
    And user click on "Shop" Travel link
    When user click on Deals link
    And user can select location where to go
    And user also can pick dates
    Then user can add adults travelers
    And user also can add children as many as they can
    And finally user click "Done" button after completing selection
    And finally browser should be closed
