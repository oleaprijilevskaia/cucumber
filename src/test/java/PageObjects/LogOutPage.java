package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;

public class LogOutPage extends AbstractPage{

    public LogOutPage() {
        super.initialization(getDriver());
    }

    public  final String urlLogOutPage = "https://172.23.176.168/index.php?route=account/logout";

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButton;
}
