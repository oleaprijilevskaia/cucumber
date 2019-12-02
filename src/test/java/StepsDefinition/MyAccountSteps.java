package StepsDefinition;

import PageObjects.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static WebDriver.WebDriverChrome.getDriver;

public class MyAccountSteps {
    @Then("^My Account page is opened$")


    public void myAccountPageIsOpened() {
        Assert.assertEquals(MyAccountPage.urlMyAccountPage, GeneralSteps.getUrl());
    }

}