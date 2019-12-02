package StepsDefinition;

import PageObjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static WebDriver.WebDriverChrome.getDriver;

public class HomeSteps  {

   HomePage homePage = new HomePage();


    @Given("^Home page is displayed$")
    public void Home_page_is_displayed() {
        //homePage.initialization(getDriver());
        homePage.featured.isDisplayed();
    }

    @When("^User clicks on My Account dropdown$")
    public void Clicks_on_My_Account_dropdown() {
        //homePage.initialization(getDriver());
        homePage.myAccountDropDown.click();

    }

    @And("^User clicks on Log in link$")
    public void Clicks_on_Log_in_Link() {
      //  homePage.initialization(getDriver());
       homePage.loginLink.click();

    }


    public  void openLoginPage(){
       // homePage.initialization(getDriver());
       homePage.myAccountDropDown.click();
        homePage.loginLink.click();

    }

    }