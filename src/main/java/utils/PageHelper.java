package utils;

import org.openqa.selenium.WebDriver;

public class PageHelper {

    public static boolean iAmOnPage(WebDriver driver, String pageName) {
        // TODO Replace with WaitCondition
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final String title = driver.getTitle();
        return title.contains(pageName);
    }

}
