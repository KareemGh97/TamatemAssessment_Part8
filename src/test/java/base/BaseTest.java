package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public AndroidDriver driver;


    @BeforeTest

    public void runPackageApp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Xiaomi M2101K6G");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.casualino.base.activities.InitialActivity");//هاي واللي تحتها بجيبهم من cmd
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "co.tamatem.vipbaloot");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
