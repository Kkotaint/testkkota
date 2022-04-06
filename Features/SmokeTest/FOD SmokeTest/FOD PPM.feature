@FODPPM
Feature: SmokeTest

  Scenario: Create PPM
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    When Clicks on 'Preventive Maintenance'link
    Then user presents with PM search page
    And user search for FODPM
    And user clickS on PM
    When user 'Set PM Count' to 0
    And user change the Estimated date in Frequency Tab
    Then user able to save the PM
    And user able to Generate the Work Orders
    And user Copy the Work Order number and click Close
    When user search for the Work Order
    #And user look for findWO
    And user add the 'Assignment' details to WO
    Then user able to 'save' the Work Order
    When user workflow the Workorder
