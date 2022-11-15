package test;

import org.testng.annotations.Test;
import pages.GoogleKeywordPage;
import pages.BingKeywordPage;
import utils.driver.Driver;


public class TestClass {
    Driver driver = new Driver();
    @Test
    public  void browserSearch() throws InterruptedException {
        driver.searchEngineInitialize("https://www.google.com/","chrome");
        GoogleKeywordPage googleKeywordPage = new GoogleKeywordPage();
        googleKeywordPage.googleKeywordSearch("hepsiburada");
        driver.searchEngineInitialize("https://www.bing.com/","chrome");
        BingKeywordPage bingKeywordPage = new BingKeywordPage();
        bingKeywordPage.bingKeywordSearch("hepsiburada");
    }
}
