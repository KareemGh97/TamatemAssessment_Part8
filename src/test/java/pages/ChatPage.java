package pages;

import Helpers.ActionHelper;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatPage extends BasePage {
    public ChatPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text='دردشة']")
    WebElement chatBtn;

    @FindBy(xpath = "//*[@text='عام']")
    public static WebElement generalChat;

    @FindBy(xpath = "//*[@text='خاص']")
    public static WebElement privateChat;

    @FindBy(xpath = "//*[@text='فريق']")
    public static WebElement teamChat;

    public void openChatPage() {
        ActionHelper.waitForExistance(chatBtn,10);
        chatBtn.click();
    }
}
