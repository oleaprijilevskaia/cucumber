package Tests;

import PageObjects.CategoryPage;
import StepsDefinition.*;
import WebDriver.WebDriverChrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Test1 {
    private HomeSteps homeSteps;
    private LogInSteps logInSteps;
    private MyAccountSteps myAccountSteps;
    private CategorySteps categorySteps;
    private ProductSteps productSteps;
    private ShoppingCartSteps shoppingCartSteps;
    private LogOutSteps logOutSteps;
    private CategoryPage categoryPage;


@Before
    public void setUp(){
    WebDriverChrome.getDriver();
    homeSteps = new HomeSteps();
    logInSteps = new LogInSteps();
    myAccountSteps = new MyAccountSteps();
    categorySteps = new CategorySteps();
    productSteps = new ProductSteps();
    shoppingCartSteps = new ShoppingCartSteps();
    logOutSteps = new LogOutSteps();
    categoryPage = new CategoryPage();
}

@Test
public void loginAddToCartCheckProductIsInCart() throws InterruptedException {
    homeSteps.openLoginPage();
    logInSteps.logInPageIsOpened();
    logInSteps.enterEmailAddress();
    logInSteps.enterPassword();
    logInSteps.clickOnLoginButton();
    myAccountSteps.myAccountPageIsOpened();
    categorySteps.openCategory(1);
    categorySteps.categoryPageIsOpen();
    categorySteps.openProduct();
    productSteps.productPageIsOpened();
    productSteps.addToCart();
    shoppingCartSteps.openShoppingCart();
    shoppingCartSteps.shoppingCartIsOpened();
    shoppingCartSteps.checkCartIsAdded();
    logOutSteps.logout();
    logOutSteps.logOutPageIsOpened();

}

@Test
public void loginAddToCartRemoveFromCartCheckCartEmpty() throws InterruptedException {
    homeSteps.openLoginPage();
    logInSteps.logInPageIsOpened();
    logInSteps.enterEmailAddress();
    logInSteps.enterPassword();
    logInSteps.clickOnLoginButton();
    myAccountSteps.myAccountPageIsOpened();
    categorySteps.openCategory(1);
    categorySteps.categoryPageIsOpen();
    categorySteps.openProduct();
    productSteps.productPageIsOpened();
    productSteps.addToCart();
    shoppingCartSteps.openShoppingCart();
    shoppingCartSteps.shoppingCartIsOpened();
    shoppingCartSteps.checkCartIsAdded();
    shoppingCartSteps.removeCart();
    shoppingCartSteps.shoppingCartIsEmpty();
    logOutSteps.logout();
    logOutSteps.logOutPageIsOpened();
}
   @Test
    public void loginAddMultipleRemoveOneCheckRemoved() throws InterruptedException {
        homeSteps.openLoginPage();
        logInSteps.logInPageIsOpened();
        logInSteps.enterEmailAddress();
        logInSteps.enterPassword();
        logInSteps.clickOnLoginButton();
        myAccountSteps.myAccountPageIsOpened();
        categorySteps.openCategory(1);
        categorySteps.categoryPageIsOpen();
        categorySteps.openProduct();
        productSteps.productPageIsOpened();
        productSteps.addToCart();
        categorySteps.openCategory(6);
        categorySteps.categoryPageIsOpen();
        categorySteps.openProduct();
        productSteps.productPageIsOpened();
        productSteps.addToCart();
        shoppingCartSteps.openShoppingCart();
        shoppingCartSteps.shoppingCartIsOpened();
        shoppingCartSteps.removeCartAndVerify();
        logOutSteps.logout();
        logOutSteps.logOutPageIsOpened();
    }
@After
    public void tearDown(){
    //WebDriverChrome.deleteCookies();
    WebDriverChrome.quitTest();


}

}
