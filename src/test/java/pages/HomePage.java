package pages;

import Helpers.ActionHelper;
import base.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text='التسجيل عبر Facebook']")
    WebElement signInWithFacebookBtn;

    @FindBy(xpath = "//*[@text='الرئيسية']")
    public static WebElement homeBtn;

    public void clickOnLoginViaFaceBook() throws Exception {
        ActionHelper.waitForExistance(signInWithFacebookBtn,10);
        signInWithFacebookBtn.click();
    }
}
