package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.HomePage;
import com.automationtest.pages.PurchaseOrderLinesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ReceiptPOSteps extends Testbase {
    HomePage homePage;
    PurchaseOrderLinesPage purchaseOrderLinesPage;
    private String[] PO;

    public ReceiptPOSteps() {
        super();


    }

    @Then("^user navigate to 'Receiving' page$")
    public void user_navigate_to_Receiving_page() throws Throwable {
        homePage = new HomePage();
        homePage.searchforReceiving();

    }

    @Then("^user search for PO$")
    public void user_search_for_PO() throws Throwable {
        purchaseOrderLinesPage = new PurchaseOrderLinesPage();
        purchaseOrderLinesPage.searchPO(PO);
        purchaseOrderLinesPage.ClickonFilterTableImage();
        purchaseOrderLinesPage.clickonPOlink();


    }

    @And("^user Receipt the PO$")
    public void userReceiptThePO() {
        purchaseOrderLinesPage = new PurchaseOrderLinesPage();
        purchaseOrderLinesPage.addPO();
    }

    @And("^user Receipt the POforService$")
    public void userReceiptThePOforService() throws InterruptedException {
        purchaseOrderLinesPage = new PurchaseOrderLinesPage();
        purchaseOrderLinesPage.addPOforService();
    }
}