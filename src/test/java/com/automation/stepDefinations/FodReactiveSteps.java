package com.automation.stepDefinations;

import com.automationtest.pages.FodReactivePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class FodReactiveSteps {

    FodReactivePage fodreactive = new FodReactivePage();

    @Then("^user click on New request$")
    public void CreateNewRequest(){
        fodreactive.createNewrequest();
    }

    @Then("^user select an address$")
    public void userSelectAnAddress() throws InterruptedException {
        fodreactive.SelectAnAddress();

    }

    @Then("^user select the problem$")
    public void userSelectTheProblem() throws InterruptedException {
        fodreactive.SelectProblem();


    }

    @Then("^user fill the contact form$")
    public void userFillTheContactForm() {
        fodreactive.ContactForm();

    }

    @And("^user able to attach documents$")
    public void userAbleToAttachDocuments() {
        fodreactive.AddAttachments();
    }

    @And("^summary page create request$")
    public void summaryPageCreateRequest() {
        fodreactive.SummaryPage();

    }

    @Then("^user copy the FOD number$")
    public void userCopyTheFODNumber() throws IOException, InterruptedException {
        FodReactivePage.copyFODNumber();
    }
}
