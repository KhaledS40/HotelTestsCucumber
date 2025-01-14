Feature: User can order different types of GiftCards online

  @giftCards
  Scenario: Order any types of GiftCards online
    Given user is on the homepage
    And user click on "Shop" Travel link
    When user click on GiftCard link
    And user slide down the page and click "Buy Now" button
    And user enter recipient and your name
    And user click pick a gift card button
    And user select types of cards "Send a digital card"
    Then user select "Holidays" type
    And user select card design
    And user click "How much" button
    And user add extra amount in the card
    #And user select a specific amount to add to the card
    And user can add quantity of the cards
    And user now add a message to the card if he or she wants to where it is going
    And user can now select types of delivery and also enter and confirm recipient email
    And user select date of delivery
    And user select a specific time zone
    And now user verify the transaction in the card
    And finally user click "CheckOut" button to complete the transaction
    And finally browser should be closed



