package managers;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageObjectManager {

    private final WebDriver driver;
    private MarketDataPage marketDataPage;
    private MenuBarPage menuBarPage;
    private IndicesPage indicesPage;
    private BecomeMemberPage becomeMemberPage;
    private ExchangeMembersPage exchangeMembersPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public MarketDataPage getHomePage() {
        return (marketDataPage == null) ? marketDataPage = new MarketDataPage(driver) : marketDataPage;
    }

    public MenuBarPage getMenuBarPage() {
        return (menuBarPage == null) ? menuBarPage = new MenuBarPage(driver) : menuBarPage;
    }

    public IndicesPage getIndicesPage() {
        return (indicesPage == null) ? indicesPage = new IndicesPage(driver) : indicesPage;
    }

    public BecomeMemberPage getBecomeMemberPage() {
        return (becomeMemberPage == null) ? becomeMemberPage = new BecomeMemberPage(driver) : becomeMemberPage;
    }

    public ExchangeMembersPage getExchangeMemberPage() {
        return (exchangeMembersPage == null) ? exchangeMembersPage = new ExchangeMembersPage(driver) : exchangeMembersPage;
    }
}