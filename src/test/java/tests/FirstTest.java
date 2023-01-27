package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class FirstTest extends BaseTest {

    @Test(priority = 1, description = "click on login via Facebook ")
    public void LoginToAppViaFacebook() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLoginViaFaceBook();

    }

    @Test(priority = 2, description = "click on login via Facebook ")
    public void goToChat() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.openChatPage();
       Assert.assertTrue(HomePage.generalChat.isDisplayed());
       Assert.assertTrue(HomePage.privateChat.isDisplayed());
       Assert.assertTrue(HomePage.teamChat.isDisplayed());

    }
}