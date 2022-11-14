package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.PageHelper;

public class IndicesPage {

    final WebDriver driver;

    public IndicesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iAmPage() {
        PageHelper.iAmOnPage(driver, "Indices");
    }

}
