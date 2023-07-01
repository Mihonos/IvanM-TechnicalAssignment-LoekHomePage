package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.LoekHomePageRedirections;

public class HeaderBtnsRedirectionTest extends BaseTest {

    LoekHomePageRedirections loekHomePageRedirections;

    @Before
    public void SetUpTest(){
        loekHomePageRedirections = new LoekHomePageRedirections();
    }

    @Test
    public void LogoBtnRedirectionTest() {
        loekHomePageRedirections.logoBtnLeadsToHomePage();
        Assert.assertEquals("https://loekonline.nl/", loekHomePageRedirections.logoBtnLeadsToHomePage());
    }
    @Test
    public void AboutUsBtnRedirectionTest() {
        loekHomePageRedirections.aboutUsBtnLeadsToOverOnsPage();
        Assert.assertEquals("https://loekonline.nl/over-ons/", loekHomePageRedirections.aboutUsBtnLeadsToOverOnsPage());
    }
    @Test
    public void PricesBtnRedirectionTest() {
        loekHomePageRedirections.pricesBtnLeadsToPricesPage();
        Assert.assertEquals("https://loekonline.nl/prijzen/", loekHomePageRedirections.pricesBtnLeadsToPricesPage());
    }
    @Test
    public void ContactBtnRedirectionTest() {
        loekHomePageRedirections.contactBtnleadsToContactPage();
        Assert.assertEquals("https://loekonline.nl/contact/", loekHomePageRedirections.contactBtnleadsToContactPage());
    }
    @Test
    public void LoginBtnRedirectionTest() {
        loekHomePageRedirections.loginBtnleadsToLoginPage();
        Assert.assertEquals("https://app.loekonline.nl/user/login", loekHomePageRedirections.loginBtnleadsToLoginPage());
    }
    @Test
    public void RegisterBtnRedirectionTest() {
        loekHomePageRedirections.registerBtnleadsToRegisterPage();
        Assert.assertTrue(loekHomePageRedirections.registerBtnleadsToRegisterPage());
    }
    @Test
    public void RegisterNowBtnRedirectionTest() {
        loekHomePageRedirections.registerNowBtnleadsToRegisterPage();
        //Assert.assertEquals("https://app.loekonline.nl/user/register", loekHomePageRedirections.registerNowBtnleadsToRegisterPage());
    }
    @Test
    public void OverLoekBtnRedirectionTest() {
        loekHomePageRedirections.overLoekBtnleadsToOverOnsPage();
        //Assert.assertEquals("https://loekonline.nl/over-ons/", loekHomePageRedirections.overLoekBtnleadsToOverOnsPage());
    }



}
