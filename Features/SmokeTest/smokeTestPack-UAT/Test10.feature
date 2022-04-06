@Test10UAT @SmokeTest
Feature: SmokeTest

  Scenario: Creating a new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name        | Customer | Location | summary                | classification                                  | details   | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | SmokeTest-10 | C1000011 | L1001455 | Subcontractor Process | REACTIVE \ CLEANING \ CLEAN (DEEP) \ CLEANREQ | SmokeTest |                   | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    And user copy the SR Number

  Scenario: Creating a WorkOrder
    Then user clicks on 'Route Workflow' button
    And user verifies the status of the newly created WorkOrder
    And user search for WorkOrder
    Then user clicks on Assignments tab
    And verify skill level should be 'SPECIAL'

  Scenario: Creating a PurchaseOrder
    Then user clicks on 'GOTO' button
    And user clicks on 'Purchasing' link
    And user clicks on 'Purchase Orders' link
    Then user clicks on plus button to create a new Purchase Order
    And user fill the new Purchase Order Details

  Scenario: Link WO and PO
    Then user click on 'POLines'Tab
    Then user add the NewRow
    And user fill the PurchaseOrder Lines
    Then user workflow the PurchaseOrder
    And user submit the PurchaseOrder for Approval process
    And user verify the status of the PurchaseOrder submitted

  Scenario: Receipt PO
    Then user navigate to 'Receiving' page
    And user search for PO
    And user Receipt the PO

   Scenario: Add actual start and finish dates
     Then user search for WorkOrder
     And user set the Actual Start Date for WorkOrder
     And user set the Actual Finish Date for WorkOrder
     Then user fill the vendor details
     And user workflow the Workorder thrice

