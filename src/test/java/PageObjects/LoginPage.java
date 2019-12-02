package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;

public class LoginPage extends AbstractPage{

    public LoginPage() {
        super.initialization(getDriver());
    }

    /////////////////XPath////////////////
    @FindBy(xpath ="//input[@id='input-password']")
    public  WebElement password;
    @FindBy(xpath ="//input[@class='btn btn-primary']")
    public  WebElement loginButton;
    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement emailAddress;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    public WebElement warningMessage;
    @FindBy(xpath = "//div[@id='account-login']//li[1]")
    public WebElement homeButtonLink;

    public  final String email = "sholmes@gmail.com";
    public  final String passwordValid = "Holmes1234";
    public  final String urlLoginPage = "https://172.23.176.168/index.php?route=account/login";


}
