$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTest/smokeTestPack-UAT/Test10.feature");
formatter.feature({
  "line": 2,
  "name": "SmokeTest",
  "description": "",
  "id": "smoketest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test10UAT"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Creating a new ServiceRequest",
  "description": "",
  "id": "smoketest;creating-a-new-servicerequest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user log in to Maximo System",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on \u0027GOTO\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on \u0027Service Desk\u0027 link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on \u0027Service Requests(SP)\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user navigated to \u0027Service Requests(SP)\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on plus button to create a new Service Request form",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user fill the new Service Request form",
  "rows": [
    {
      "cells": [
        "Name",
        "Customer",
        "Location",
        "summary",
        "classification",
        "details",
        "reportedByPhone",
        "reportedByEmail",
        "customerReference",
        "customerReference2"
      ],
      "line": 12
    },
    {
      "cells": [
        "SmokeTest-10",
        "C1000011",
        "L1001455",
        "Subcontractor Process",
        "REACTIVE \\ CLEANING \\ CLEAN (DEEP) \\ CLEANREQ",
        "SmokeTest",
        "",
        "test@email.com",
        "123",
        "7345"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on \u0027Save ServiceRequest\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user copy the SR Number",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_log_in_to_Maximo_System()"
});
formatter.result({
  "duration": 5687317500,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_GOTO_button()"
});
formatter.result({
  "duration": 2267360400,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Service_Desk_link()"
});
formatter.result({
  "duration": 2133293600,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Service_Requests_SP_link()"
});
formatter.result({
  "duration": 2072965300,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_navigated_to_Service_Requests_SP_page()"
});
formatter.result({
  "duration": 23144800,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_plus_button_to_create_a_new_Service_Request_form()"
});
formatter.result({
  "duration": 1219342700,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userFillTheNewServiceRequestFormForQuote(DataTable)"
});
formatter.result({
  "duration": 24641784800,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_Save_ServiceRequest_button()"
});
formatter.result({
  "duration": 1124177900,
  "status": "passed"
});
formatter.match({
  "location": "ServiceRequestCreationSteps.userCopyTheSRNumber()"
});
formatter.result({
  "duration": 2096248200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Creating a WorkOrder",
  "description": "",
  "id": "smoketest;creating-a-workorder",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user clicks on \u0027Route Workflow\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user verifies the status of the newly created WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user search for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on Assignments tab",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "verify skill level should be \u0027SPECIAL\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WorkOrderCreationSteps.user_clicks_on_Route_Workflow_button()"
});
formatter.result({
  "duration": 4666353000,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.user_verifies_the_status_of_the_newly_created_WorkOrder()"
});
formatter.result({
  "duration": 3246655200,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "duration": 7452411700,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userClicksOnAssignments()"
});
formatter.result({
  "duration": 2263971400,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userVerifySkillLevel()"
});
formatter.result({
  "duration": 2142305600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Creating a PurchaseOrder",
  "description": "",
  "id": "smoketest;creating-a-purchaseorder",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user clicks on \u0027GOTO\u0027 button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks on \u0027Purchasing\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user clicks on \u0027Purchase Orders\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user clicks on plus button to create a new Purchase Order",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user fill the new Purchase Order Details",
  "keyword": "And "
});
formatter.match({
  "location": "ServiceRequestCreationSteps.user_clicks_on_GOTO_button()"
});
formatter.result({
  "duration": 2291281600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.user_clicks_on_Purchasing_link()"
});
formatter.result({
  "duration": 429102800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.user_clicks_on_Purchase_Orders_link()"
});
formatter.result({
  "duration": 28200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.user_clicks_on_plus_button_to_create_a_new_Purchase_Order()"
});
formatter.result({
  "duration": 999228300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.userFillTheNewPurchaseOrderForm()"
});
formatter.result({
  "duration": 12175069200,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Link WO and PO",
  "description": "",
  "id": "smoketest;link-wo-and-po",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user click on \u0027POLines\u0027Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user add the NewRow",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user fill the PurchaseOrder Lines",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user workflow the PurchaseOrder",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user submit the PurchaseOrder for Approval process",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user verify the status of the PurchaseOrder submitted",
  "keyword": "And "
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.user_click_on_POLines_Tab()"
});
formatter.result({
  "duration": 436296400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.user_add_the_NewRow()"
});
formatter.result({
  "duration": 556672000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.user_fill_the_PurchaseOrder_Lines()"
});
formatter.result({
  "duration": 12329678700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.userWorkflowThePurchaseOrder()"
});
formatter.result({
  "duration": 247121100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.userSubmitThePurchaseOrderForApprovalProcess()"
});
formatter.result({
  "duration": 1324841900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseOrderCreationSteps.userVerifyTheStatusOfThePurchaseOrderSubmitted()"
});
formatter.result({
  "duration": 152436200,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Receipt PO",
  "description": "",
  "id": "smoketest;receipt-po",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "user navigate to \u0027Receiving\u0027 page",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user search for PO",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Receipt the PO",
  "keyword": "And "
});
formatter.match({
  "location": "ReceiptPOSteps.user_navigate_to_Receiving_page()"
});
formatter.result({
  "duration": 4696490900,
  "status": "passed"
});
formatter.match({
  "location": "ReceiptPOSteps.user_search_for_PO()"
});
formatter.result({
  "duration": 2907642200,
  "status": "passed"
});
formatter.match({
  "location": "ReceiptPOSteps.userReceiptThePO()"
});
formatter.result({
  "duration": 1923064900,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Add actual start and finish dates",
  "description": "",
  "id": "smoketest;add-actual-start-and-finish-dates",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "user search for WorkOrder",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user set the Actual Start Date for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user set the Actual Finish Date for WorkOrder",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user fill the vendor details",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user workflow the Workorder thrice",
  "keyword": "And "
});
formatter.match({
  "location": "WorkOrderCreationSteps.userSearchForWorkOrder()"
});
formatter.result({
  "duration": 7196550500,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.userSetTheActualStartDateForWorkOrder()"
});
formatter.result({
  "duration": 5879406000,
  "status": "passed"
});
formatter.match({
  "location": "CustomerBillingSteps.userSetTheActualFinishDateForWorkOrder()"
});
formatter.result({
  "duration": 5586370000,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userFillTheVendorDetails()"
});
formatter.result({
  "duration": 1188226500,
  "status": "passed"
});
formatter.match({
  "location": "WorkOrderCreationSteps.userWorkflowTheWorkorderthrice()"
});
formatter.result({
  "duration": 48999969100,
  "status": "passed"
});
});