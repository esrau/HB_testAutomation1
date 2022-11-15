package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Component.SearchResultsBing;
import utils.Utilities;
import java.util.ArrayList;
import java.util.List;

public class BingKeywordPage extends Utilities {
    @FindBy(xpath = "//input[@id='sb_form_q']")
    public WebElement bingKeywordInput;

    @FindBy(xpath = "//label[@id='search_icon']")
    public WebElement bingSearchButton;

    @FindBy(css = "[class='b_algo']")
    public List<SearchResultsBing> results;
    public void bingKeywordSearch(String keyword) {
        elementSendkey(bingKeywordInput,keyword);
        elementClick(bingSearchButton);
        List<String> addResults = new ArrayList<>();

        for (SearchResultsBing result:results)
        {
            addResults.add(result.getTitle());
            addResults.add(result.getLink());
            addResults.add(result.getDetail());
        }
        System.out.println("BING "+addResults);
    }
}

