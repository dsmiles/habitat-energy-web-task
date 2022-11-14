package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class BecomeMemberPage {

    final WebDriver driver;

    public BecomeMemberPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iAmOnPage() {
        PageHelper.iAmOnPage(driver, "Become a member");
    }

}
