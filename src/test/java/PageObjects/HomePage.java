package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;

public class HomePage extends AbstractPage{
    public HomePage() {
        super.initialization(getDriver());
    }

    /////////////////XPath////////////////
    ///Menu bar/////////
    @FindBy(xpath ="//ul[@class='list-inline']//a[@class='dropdown-toggle']")
    public WebElement myAccountDropDown;
    @FindBy(xpath ="//a[contains(text(),'Login')]")
    public WebElement loginLink;
    @FindBy(xpath ="//a[contains(text(),'Logout')]")
    public WebElement logoutLink;
    @FindBy(xpath ="//span[contains(text(),'Shopping Cart')]")
    public WebElement shoppingCart;
    @FindBy(xpath ="//h3[contains(text(),'Featured')]")
    public WebElement featured;

    //public static final By myAccountDropDown = By.xpath("//ul[@class='list-inline']//a[@class='dropdown-toggle']");
//    public static final By loginLink = By.xpath("//a[contains(text(),'Login')]");
//    public static final By logoutLink =By.xpath("//a[contains(text(),'Logout')]");
//    public static final By shoppingCart = By.xpath("//span[contains(text(),'Shopping Cart')]");
//    public static final By featured = By.xpath("//h3[contains(text(),'Featured')]");


    }
