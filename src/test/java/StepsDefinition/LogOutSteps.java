package StepsDefinition;

import PageObjects.AbstractPage;
import PageObjects.HomePage;
import PageObjects.LogOutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Before;

import static WebDriver.WebDriverChrome.getDriver;

public class LogOutSteps {
 LogOutPage logOutPage = new LogOutPage();
HomePage homePage = new HomePage();

    @And("^user logs out$")
    public void logout(){
      //  homePage.initialization(getDriver());
        homePage.myAccountDropDown.click();
        homePage.logoutLink.click();
    }
    public void logOutPageIsOpened(){
        Assert.assertTrue(GeneralSteps.getUrl().contains(logOutPage.urlLogOutPage));
    }


    @Then("^user clicks on Continue button$")
    public void clicksOnContinueButton() {
       // logOutPage.initialization(getDriver());
        logOutPage.continueButton.click();
    }
}
