package StepsDefinition;

import PageObjects.HomePage;
import PageObjects.ProductPage;
import PageObjects.ShoppingCartPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static WebDriver.WebDriverChrome.getDriver;

public class ShoppingCartSteps {
ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
HomePage homePage =new HomePage();
    public void openShoppingCart(){
       // homePage.initialization(getDriver());
        homePage.shoppingCart.click();
    }

    public void shoppingCartIsOpened(){
        Assert.assertEquals(shoppingCartPage.urlShoppingCart,GeneralSteps.getUrl());
    }

    public void checkCartIsAdded(){
       // shoppingCartPage.initialization(getDriver());
        Assert.assertNotNull(shoppingCartPage.shoppingCartTable.isDisplayed());

    }

    public void removeCart(){
        //shoppingCartPage.initialization(getDriver());
        shoppingCartPage.removeProduct.click();


    }
    public void shoppingCartIsEmpty(){
        Assert.assertNotNull(shoppingCartPage.emptyCartMessage.isDisplayed());

    }

    public int parseTable(){
        //shoppingCartPage.initialization(getDriver());
        List<WebElement> rows = shoppingCartPage.table.findElements(By.tagName("tr"));
        int size = rows.size();
        System.out.println(size);
        return size;
    }

    public boolean removeCartAndVerify() throws InterruptedException {
        int s1 = parseTable();
        removeCart();
        Thread.sleep(1000);
        int s2 = parseTable();
        if(s1 < s2)
            return true;
        else return false;

    }
}
