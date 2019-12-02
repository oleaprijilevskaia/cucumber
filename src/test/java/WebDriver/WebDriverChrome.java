package WebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class WebDriverChrome {

        public static org.openqa.selenium.WebDriver driver = null;


        public static WebDriver getDriver() {
            if (driver == null) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\oprijilevskaia\\IdeaProjects\\selenium\\driver" +
                        "\\chromedriver.exe");

                driver = new ChromeDriver();

                // To maximize browser
                driver.manage().window().maximize();

                // Implicit wait
                driver.manage().timeouts().implicitlyWait(
                        10, TimeUnit.SECONDS);

                driver.get("https://172.23.176.168/");
            }
            return driver;
        }

        // Test cleanup
        public static void quitTest() {
            getDriver().quit();
            driver = null;
        }

        public static void close() {
            getDriver().close();
        }

        public static void deleteCookies() {
            getDriver().manage().deleteAllCookies();
        }
    }
