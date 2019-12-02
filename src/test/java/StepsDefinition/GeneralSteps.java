package StepsDefinition;

import static WebDriver.WebDriverChrome.getDriver;

public class GeneralSteps {
    public static String getUrl() {
        String url = getDriver().getCurrentUrl();
        return url;
    }


}
