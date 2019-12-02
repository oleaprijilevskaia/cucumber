package StepsDefinition;

import PageObjects.AbstractPage;
import PageObjects.CategoryPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static WebDriver.WebDriverChrome.getDriver;

public class CategorySteps {
    private CategoryPage categoryPage = new CategoryPage();

    public void categoryPageIsOpen() {
        Assert.assertTrue(GeneralSteps.getUrl().contains(CategoryPage.urlCategoryPage));

    }

    public void openCategory(int category) {
        //categoryPage.initialization(getDriver());
        // categoryPage.categories.findElement(By.xpath("./a[contains(text(),'" + category + "')]")).click(); }
        categoryPage.categories.findElement(By.xpath("./li["+category+"]/a")).click();
    }
    public void openProduct() {
        //categoryPage.initialization(getDriver());
        categoryPage.openProduct.click();
    }
}

