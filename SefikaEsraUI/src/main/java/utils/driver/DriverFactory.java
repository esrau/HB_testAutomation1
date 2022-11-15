package utils.driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    public static WebDriver getDriver(String searchEngine, String browserName){
        WebDriver driver;
        if (browserName=="chrome"){
                ChromeOptions chromeOptions = new ChromeOptions();
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        else if (browserName=="firefox"){
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver");
                driver = new FirefoxDriver();
        }
        else {
                Assert.fail("Please your choose browser");
                return null ;
        }
        driver.get(searchEngine);
        return driver;
    }
}
