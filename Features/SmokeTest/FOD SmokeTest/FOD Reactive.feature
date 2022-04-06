@FODReactive
Feature: SmokeTest

  Scenario:Log in to FOD environment
    Given user log in to FOD System
    Then user click on New request
    Then user select an address
    Then user select the problem
    #Then user choose a service category and task
    Then user fill the contact form
    And user able to attach documents
    And summary page create request
    Then user copy the FOD number


    Given user log in to PreProduction Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    And user clicks on advance search
    And user clicks on find button
    And user clicks on 'Route Workflow' button and accept the alert

  Scenario: Verify the WorkOrder
    When user clicks on 'Work' tab
    Then user verify the 'WorkOrder'Number
    And user search for WorkOrder
    And user add the labour details in 'Assignment' section
    And user clicks on 'Workflow' button