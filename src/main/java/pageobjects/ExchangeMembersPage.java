package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class ExchangeMembersPage {

    final WebDriver driver;

    public ExchangeMembersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iAmPage() {
        PageHelper.iAmOnPage(driver, "Exchange Members");
    }

}
