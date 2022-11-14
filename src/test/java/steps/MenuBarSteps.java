package steps;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.MenuBarPage;

public class MenuBarSteps {

    final TestContext testContext;
    final MenuBarPage menuBarPage;

    public MenuBarSteps(TestContext context) {
        testContext = context;
        menuBarPage = testContext.getPageObjectManager().getMenuBarPage();
    }

    @When("they click on Market Data menu")
    public void theyClickOnMarketDateMenu() throws InterruptedException {
        menuBarPage.clickMarketDataMenu();
        Thread.sleep(1000);
    }

    @And("they click on Market Data menu item {string}")
    public void theyClickOnMarketDataMenuItem(String menuItem) {
        menuBarPage.clickMarketDataMenuItem(menuItem);
    }

    @When("they click on Market Access menu")
    public void theyClickOnMarketAccessMenu() throws InterruptedException {
        menuBarPage.clickMarketAccessMenu();
        Thread.sleep(1000);
    }

    @When("they click on Market Access menu item {string}")
    public void theyClickMarketAccessMenuMenuItem(String menuItem) {
        menuBarPage.clickMarketAccessMenuItem(menuItem);
    }

    @When("they click on Trading Services menu")
    public void theyClickOnTradingServicesMenu() throws InterruptedException {
        menuBarPage.clickTradingServicesMenu();
        Thread.sleep(1000);
    }

    @When("they click on Trading Services Access menu item {string}")
    public void theyClickTradingServicesMenuItem(String menuItem) {
        menuBarPage.clickTradingServicesMenuItem(menuItem);
    }

    @When("they click on Market Regulations menu")
    public void theyClickOnMarketRegulationsMenu() throws InterruptedException {
        menuBarPage.clickMarketRegulationsMenu();
        Thread.sleep(1000);
    }

    @When("they click on Markets Regulation menu item {string}")
    public void theyClickMarketRegulationsMenuItem(String menuItem) {
        menuBarPage.clickMarketRegulationsMenuItem(menuItem);
    }

    @When("they click on Corporate menu")
    public void theyClickOnCorporateMenu() throws InterruptedException {
        menuBarPage.clickCorporateMenu();
        Thread.sleep(1000);
    }

    @When("they click on Corporate menu item {string}")
    public void theyClickCorporateMenuItem(String menuItem) {
        menuBarPage.clickCorporateMenuItem(menuItem);
    }

}
