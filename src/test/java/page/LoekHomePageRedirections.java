package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoekHomePageRedirections extends BaseTest {

    public LoekHomePageRedirections() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#logo")
    WebElement logoBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[1]")
    WebElement aboutUsBtn;

    public String logoBtnLeadsToHomePage(){
        logoBtn.click();
        return driver.getCurrentUrl();
    }

    public String aboutUsBtnLeadsToOverOnsPage(){
        aboutUsBtn.click();
        return driver.getCurrentUrl();
    }


}
