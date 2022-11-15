package pages.Component;

import com.github.webdriverextensions.WebComponent;
import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.driver.Driver.driver;

public class SearchResultsBing extends WebComponent {

    public SearchResultsBing(){
        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver),this);
    }
    @FindBy(tagName = "h2")
    public WebElement resultTitle;
    @FindBy(xpath = "//div[@class='b_caption']/p")
    public WebElement resultDetail;
    @FindBy(xpath = "//div[@Class='b_title']/a")
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
