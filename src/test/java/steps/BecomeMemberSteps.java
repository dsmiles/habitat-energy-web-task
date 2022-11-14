package steps;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.IndicesPage;
import utils.PageHelper;

import static org.junit.Assert.assertTrue;

public class BecomeMemberSteps {
    final TestContext testContext;
    final IndicesPage indicesPage;
    final WebDriver driver;

    public BecomeMemberSteps(TestContext context) {
        testContext = context;
        indicesPage = testContext.getPageObjectManager().getIndicesPage();
        driver = testContext.getWebBrowserManager().getDriver();
    }

    @Then("user is on Become a member page")
    public void userIsOnBecomeAMemberPage() {
        assertTrue(PageHelper.iAmOnPage(driver, "Become a member"));
    }
}
