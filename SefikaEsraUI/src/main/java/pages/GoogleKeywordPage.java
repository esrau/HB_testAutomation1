package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Component.SearchResultsGoogle;
import utils.Utilities;
import java.util.ArrayList;
import java.util.List;

public class GoogleKeywordPage extends Utilities  {
    @FindBy(xpath = "(//input[@name='q'])[1]")
    public WebElement googleKeywordInput;

    @FindBy(xpath = "//input[@name='btnK']")
    public WebElement googleSearchButton;

    @FindBy(css = "[data-sokoban-container]")
    public List<SearchResultsGoogle> results;

    public void googleKeywordSearch(String keyword)  {
        elementSendkey(googleKeywordInput,keyword);
        elementClick(googleSearchButton);
        List<String> addResult = new ArrayList<>();

        for (SearchResultsGoogle result:results)
        {
           addResult.add(result.getTitle());
           addResult.add(result.getLink());
           addResult.add(result.getDetail());
        }
        System.out.println("GOOGLE "+addResult);
        }
}
