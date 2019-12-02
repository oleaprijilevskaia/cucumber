package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;

public class MyAccountPage extends AbstractPage{
    public MyAccountPage() {
        super.initialization(getDriver());
    }

    @FindBy(xpath ="//h2[contains(text(),'My Account')]")
    public WebElement myAccount;
    //public static final By myAccount = By.xpath("//h2[contains(text(),'My Account')]");
    public static final String urlMyAccountPage = "https://172.23.176.168/index.php?route=account/account";
}
