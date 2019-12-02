package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static WebDriver.WebDriverChrome.getDriver;


public class CategoryPage extends AbstractPage{

    public CategoryPage() {
        super.initialization(getDriver());
    }

    @FindBy(xpath ="//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]")
    public WebElement phonesAndPdasLink;
    @FindBy(xpath ="//div[@class='image']//img[@class='img-responsive']")
    public WebElement openProduct;
    @FindBy(xpath = "//nav[@id='menu']/div[2]/ul")
    public WebElement categories;

    public static final String urlCategoryPage = "http://172.23.176.168/index.php?route=product/category";



}
