package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
    public AndroidDriver driver;

    public  BasePage(WebDriver driver) {
        this.driver = (AndroidDriver) driver;
        PageFactory.initElements(driver, this);
    }


}
