package pages.Component;

import com.github.webdriverextensions.WebComponent;
import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.driver.Driver.driver;

public class SearchResultsGoogle extends WebComponent {

    public SearchResultsGoogle(){
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver),this);
    }
    @FindBy(tagName = "h3")
    public WebElement resultTitle;
    @FindBy(xpath = "//div[@data-content-feature='1']")
    public WebElement resultDetail;
    @FindBy(xpath = "//div[@data-header-feature='0']/div/a")
    public WebElement resultHeader;

    public String getTitle()
    {
        return resultTitle.getText();
    }

    public String getDetail()
    {
        return resultDetail.getText();
    }

    public String getLink()
    {
        return resultHeader.getAttribute("href");
    }
}
