package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;

public class ShoppingCartPage extends AbstractPage{
    public ShoppingCartPage() {
        super.initialization(getDriver());
    }

    @FindBy(xpath ="//table[@class='table table-bordered']")
    public WebElement shoppingCartTable;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement removeProduct;
    @FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
    public WebElement emptyCartMessage;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody")
    public WebElement table;
    @FindBy(xpath = "")
    public static final String urlShoppingCart = "http://172.23.176.168/index.php?route=checkout/cart";
    //public static final By shoppingCartTable = By.xpath("//div[@class='table-responsive']");
}
