package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.Wait;

public class PageHelper {

    public static boolean iAmOnPage(WebDriver driver, String pageName) {
        Wait.until(driver, ExpectedConditions.titleContains(pageName));
        return driver.getTitle().contains(pageName);
    }
}
