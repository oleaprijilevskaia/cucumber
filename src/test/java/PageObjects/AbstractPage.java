package PageObjects;

import org.jsoup.select.Evaluator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    public  void initialization(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

}
