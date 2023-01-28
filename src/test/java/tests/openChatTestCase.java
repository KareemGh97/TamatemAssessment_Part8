package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChatPage;
import pages.HomePage;

public class openChatTestCase extends BaseTest {

    @Test(priority = 1, description = "click on login via Facebook ")
    public void LoginToAppViaFacebook() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLoginViaFaceBook();
        //assert that the user is successfully login
        Assert.assertTrue(HomePage.homeBtn.isDisplayed());
    }

    @Test(priority = 2, description = "verify that the user is able to navigate to chat page  ")
    public void goToChat()  {
        ChatPage chatPage = new ChatPage(driver);
        chatPage.openChatPage();
        // assert that the user is in chat page after clicking on chat button by checking that chat type is displayed in the page
        Assert.assertTrue(chatPage.generalChat.isDisplayed());
        Assert.assertTrue(chatPage.privateChat.isDisplayed());
        Assert.assertTrue(chatPage.teamChat.isDisplayed());
    }
}