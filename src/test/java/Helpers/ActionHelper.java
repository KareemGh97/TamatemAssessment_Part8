package Helpers;

import org.openqa.selenium.*;
import org.testng.Assert;

public class ActionHelper {

    public static boolean waitForExistance(WebElement element, int seconds) {
        boolean isExist = false;

        int count = 1;
        while (count <= seconds) {
            try {
                Thread.sleep(1000);
                if (element.isDisplayed()) {
                    isExist = true;
                    break;
                }
            } catch (Exception e) {
                System.out.println("Exception message: " + e.getMessage());
            }
            count++;
        }

        return isExist;
    }

    public static void javaScriptClick(WebElement element, WebDriver driver) throws Exception {

        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

            System.out.println("click on element");

        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page document " + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element was not found in DOM " + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Unable to click on element " + e.getStackTrace());
        }
    }

    public static void retryClick(WebElement myelement, int maxSeconds) {
        int i = 0;
        boolean result = false;
        while (i <= maxSeconds) {
            try {
                myelement.click();
                result = true;
                break;
            } catch (Exception e) {
                result = false;
            }
            i++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        if (!result) {
            Assert.fail("Failed to click element: " + myelement.toString());
        }


    }

}
