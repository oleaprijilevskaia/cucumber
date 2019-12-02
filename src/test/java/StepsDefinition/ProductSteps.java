package StepsDefinition;

import PageObjects.ProductPage;
import org.junit.Assert;

import static WebDriver.WebDriverChrome.getDriver;

public class ProductSteps {
    ProductPage productPage = new ProductPage();
    public void productPageIsOpened(){
        Assert.assertNotNull(GeneralSteps.getUrl().contains(ProductPage.urlProductPage));
    }

    public void addToCart(){
     //   productPage.initialization(getDriver());
        productPage.addToCartButton.click();
    }



}
