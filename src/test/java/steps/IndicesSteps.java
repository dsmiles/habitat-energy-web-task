package steps;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.IndicesPage;
import utils.PageHelper;

import static org.junit.Assert.assertTrue;

public class IndicesSteps {

    final TestContext testContext;
    final IndicesPage indicesPage;
    final WebDriver driver;

    public IndicesSteps(TestContext context) {
        testContext = context;
        indicesPage = testContext.getPageObjectManager().getIndicesPage();
        driver = testContext.getWebBrowserManager().getDriver();
    }

    @Then("user is on Indices page")
    public void userIsOnIndicesPage() {
        assertTrue(PageHelper.iAmOnPage(driver, "Indices"));
    }
}
