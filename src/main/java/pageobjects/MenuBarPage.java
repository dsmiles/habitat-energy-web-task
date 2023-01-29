package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

public class MenuBarPage {

    final WebDriver driver;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/nav/ul[1]/li[1]/a")
    private WebElement marketDataMenu;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/nav/ul[1]/li[2]/a")
    private WebElement marketAccessMenu;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/nav/ul[1]/li[3]/a")
    private WebElement tradingServicesMenu;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/nav/ul[1]/li[4]/a")
    private WebElement marketRegulationsMenu;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div/nav/ul[1]/li[5]/a")
    private WebElement corporateMenu;

    @FindBy(css = "#navbar a[href='/en/market-data']")
    public WebElement marketDateMarketResultsMenuItem;

    @FindBy(css = "#navbar a[href='/en/indices']")
    public WebElement marketDataIndicesMenuItem;

    @FindBy(css = "#navbar a[href='/en/marketdataservices']")
    public WebElement marketDataServicesMenuItem;

    @FindBy(css = "#navbar a[href='http://webshop.eex-group.com']")
    public WebElement marketDataOrderDataMenuItem;

    @FindBy(css = "#navbar a[href='/en/GCDataUse']")
    public WebElement marketDataGDCMenuItem;

    @FindBy(css = "#navbar a[href='/en/datavendors']")
    public WebElement marketDataVendorsMenuItem;

    @FindBy(css = "#navbar a[href='/en/becomeamember']")
    public WebElement marketAccessBecomeMemberMenuItem;

    @FindBy(css = "#navbar a[href='/en/exchangemembers']")
    public WebElement marketAccessExchangeMembersMenuItem;

    @FindBy(css = "#navbar a[href='/en/small-market-participants']")
    public WebElement marketAccessSmallMarketsMenuItem;

    @FindBy(css = "#navbar a[href='/en/software-providers']")
    public WebElement marketAccessSoftwareProvidersMenuItem;

    @FindBy(css = "#navbar a[href='/en/tradingproducts']")
    public WebElement tradingServicesTradingProductsMenuItem;

    @FindBy(css = "#navbar a[href='/en/technology']")
    public WebElement tradingServicesTechnologyMenuItem;

    @FindBy(css = "#navbar a[href='/en/fees']")
    public WebElement tradingServicesFeesMenuItem;

    @FindBy(css = "#navbar a[href='/en/elearning']")
    public WebElement tradingServicesElearningMenuItem;

    @FindBy(css = "#navbar a[href='https://www.epexspot.com/en/market-solutions-system-operators']")
    public WebElement tradingServicesMarketSolutionsMenuItem;

    @FindBy(css = "#navbar a[href='/en/servicespx']")
    public WebElement tradingServicesToOtherPowerExchangesMenuItem;

    @FindBy(css = "#navbar a[href='/en/consulting']")
    public WebElement tradingServicesConsultingMenuItem;

    public MenuBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMarketDataMenu() {
        marketDataMenu.click();
        Wait.untilPageLoadComplete(driver);
    }

    public void clickMarketDataMenuItem(String menuItem) {
        switch (menuItem) {
            case "Market Results":
                marketDateMarketResultsMenuItem.click();
                break;
            case "Indices":
                marketDataIndicesMenuItem.click();
                break;
            case "Market Data Services":
                marketDataServicesMenuItem.click();
                break;
            case "Order Market Data":
                marketDataOrderDataMenuItem.click();
                break;
            case "General Conditions of Data Use":
                marketDataGDCMenuItem.click();
                break;
            case "List of Data Vendors":
                marketDataVendorsMenuItem.click();
                break;
            default:
                break;
        }
        Wait.untilPageLoadComplete(driver);
    }

    public void clickMarketAccessMenu() {
        marketAccessMenu.click();
    }

    public void clickMarketAccessMenuItem(String menuItem) {
        switch (menuItem) {
            case "Become a Member":
                marketAccessBecomeMemberMenuItem.click();
                break;
            case "Exchange Members":
                marketAccessExchangeMembersMenuItem.click();
                break;
            case "Small Market Participants":
                marketAccessSmallMarketsMenuItem.click();
                break;
            case "Software Providers":
                marketAccessSoftwareProvidersMenuItem.click();
                break;
            default:
                break;
        }
        Wait.untilPageLoadComplete(driver);
    }

    public void clickTradingServicesMenu() {
        tradingServicesMenu.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickTradingServicesMenuItem(String menuItem) {
        // TODO
    }

    public void clickMarketRegulationsMenu() {
        marketRegulationsMenu.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickMarketRegulationsMenuItem(String menuItem) {
        // TODO
    }

    public void clickCorporateMenu() {
        corporateMenu.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickCorporateMenuItem(String menuItem) {
        // TODO
    }
}
