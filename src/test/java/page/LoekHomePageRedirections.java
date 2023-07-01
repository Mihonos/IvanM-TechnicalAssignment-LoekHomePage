package page;

import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoekHomePageRedirections extends BaseTest {

    public LoekHomePageRedirections() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#logo")
    WebElement logoBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[1]")
    WebElement aboutUsBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[2]")
    WebElement pricesBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[3]")
    WebElement contactBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[4]")
    WebElement loginBtn;
    @FindBy(xpath = "//ul[@id='top-menu']/li[5]/a")
    WebElement regiterBtn;
    @FindBy(className = "et_pb_promo_button")
    WebElement registerNowBtn;
    @FindBy(xpath = "//a[@href='https://loekonline.nl/over-ons/'][contains(.,'over LOEK!')]")
    WebElement overLoekBtn;
    @FindBy(css = "#submitAanmelden")
    WebElement registrationBtn;


    public String logoBtnLeadsToHomePage(){
        logoBtn.click();
        return driver.getCurrentUrl();
    }
    public String aboutUsBtnLeadsToOverOnsPage(){
        aboutUsBtn.click();
        return driver.getCurrentUrl();
    }
    public String pricesBtnLeadsToPricesPage(){
        pricesBtn.click();
        return driver.getCurrentUrl();
    }
    public String contactBtnleadsToContactPage(){
        contactBtn.click();
        return driver.getCurrentUrl();
    }
    public String loginBtnleadsToLoginPage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(loginBtn).build().perform();
        loginBtn.click();
        return driver.getCurrentUrl();
    }
    public boolean registerBtnleadsToRegisterPage(){
        regiterBtn.click();
        return registrationBtn.isDisplayed();
    }
    public void registerNowBtnleadsToRegisterPage(){
        //Actions actions = new Actions(driver);
        //actions.moveToElement(registerNowBtn).build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", registerNowBtn);
        wdWait.until(ExpectedConditions.elementToBeClickable(registerNowBtn));
        registerNowBtn.click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://app.loekonline.nl/user/register");
    }
    public void overLoekBtnleadsToOverOnsPage() {
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overLoekBtn);
        //wdWait.until(ExpectedConditions.elementToBeClickable(overLoekBtn));
        overLoekBtn.click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://loekonline.nl/over-ons/");
    }

}
