package StepsDefinition;

import static org.junit.Assert.*;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static WebDriver.WebDriverChrome.getDriver;

public class LogInSteps {

    LoginPage loginPage = new LoginPage();

    @Then("^Log in page is opened$")
    public void logInPageIsOpened() {
        Assert.assertEquals(loginPage.urlLoginPage, GeneralSteps.getUrl());
    }

    @When("^Enters valid Email Address and Password$")
    public void enterValidEmailAddressAndPassword() {
        loginPage.emailAddress.sendKeys(loginPage.email);
        loginPage.password.sendKeys(loginPage.passwordValid);
    }


    @And("^User presses Login button$")
    public void userPressesLoginButton() {
        loginPage.loginButton.click();
    }

    @When("^Enters  ([^\"]*) and ([^\"]*)$")
    public void entersEmail_addressAndPassword(String emailAddress, String password) {
        loginPage.emailAddress.sendKeys(emailAddress);
        loginPage.password.sendKeys(password);

    }


    public void loginPageIsOpen() {
        Assert.assertEquals(loginPage.urlLoginPage, GeneralSteps.getUrl());

    }

    public void enterEmailAddress() {
        loginPage.emailAddress.sendKeys(loginPage.email);
        Assert.assertNotNull(loginPage.emailAddress.getText());
    }

    public void enterPassword() {
        loginPage.password.sendKeys(loginPage.passwordValid);
        Assert.assertNotNull(loginPage.password.getText());
    }

    public void clickOnLoginButton() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(1000);

    }


    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String email, String password) {
        loginPage.emailAddress.sendKeys(email);
        loginPage.password.sendKeys(password);
        Assert.assertNotNull(loginPage.emailAddress.getText());
        Assert.assertNotNull(loginPage.password.getText());

    }

    @And("^user clicks on Home link$")
    public void userClicksOnHomeLink() {
        loginPage.homeButtonLink.click();
    }

    @Then("^A warning validation message \"([^\"]*)\" or \"([^\"]*)\"is displayed$")
    public boolean aWarningValidationMessageOrIsDisplayed(String message1, String message2) {
        loginPage.warningMessage.isDisplayed();
        if (loginPage.warningMessage.getText() == message1 || loginPage.warningMessage.getText() == message2) {
            return true;

        }
        return false;
    }
}
