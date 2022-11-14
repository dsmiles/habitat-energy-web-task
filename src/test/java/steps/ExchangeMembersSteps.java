package steps;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.ExchangeMembersPage;
import utils.PageHelper;

import static org.junit.Assert.assertTrue;

public class ExchangeMembersSteps {

    final TestContext testContext;
    final ExchangeMembersPage exchangeMembersPage;
    final WebDriver driver;

    public ExchangeMembersSteps(TestContext context) {
        testContext = context;
        exchangeMembersPage = testContext.getPageObjectManager().getExchangeMemberPage();
        driver = testContext.getWebBrowserManager().getDriver();
    }

    @Then("user is on Exchange Members page")
    public void userIsOnExchangeMembersPage() {
        assertTrue(PageHelper.iAmOnPage(driver, "Exchange Members"));
    }
}