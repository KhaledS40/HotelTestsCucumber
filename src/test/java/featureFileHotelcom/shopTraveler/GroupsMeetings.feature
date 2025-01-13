Feature:  User can fill future trip by filling the GroupsMeetings form

   @groupsMeetings
   Scenario: User should fill GroupsMeetings for for their future trips if they plan
      Given user is on the homepage
      And user click on "Shop" Travel link
      When user click Groups and Meetings link
      And user enters destination
      And user selects checkIn and checkOut dates
      And user select group type
      Then user enter room rate per night
      And user select star rating
      And now user can slide the night rate to the left
      And user can alide the night rate to the right
      And at the end user can submit the form
      And finally browser should be closed

