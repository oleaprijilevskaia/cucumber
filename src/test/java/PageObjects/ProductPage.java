package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;

public class ProductPage extends AbstractPage{
    public ProductPage() {
        super.initialization(getDriver());
    }

    @FindBy(xpath ="//button[@id='button-cart']")
    public WebElement addToCartButton;
    @FindBy(xpath ="//h3[contains(text(),'Available Options')]")
    public WebElement availableOptions;

//    public static final By addToCartButton = By.xpath("//button[@id='button-cart']");
//    public static final By availableOptions = By.xpath("//h3[contains(text(),'Available Options')]");
    public static final String urlProductPage = "http://172.23.176.168/index.php?route=product/product";
}
