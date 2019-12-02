package StepsDefinition;

import PageObjects.HomePage;
import WebDriver.WebDriverChrome;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import static WebDriver.WebDriverChrome.getDriver;

public class BackgroundSteps {

    @Given("^tear down$")
    public void tearDown() {
        WebDriverChrome.deleteCookies();
        WebDriverChrome.quitTest();
    }
}

