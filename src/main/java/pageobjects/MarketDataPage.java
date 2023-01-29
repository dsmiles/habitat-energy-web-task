package pageobjects;

import datatypes.MapPolygon;
import datatypes.MapValue;
import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.Wait;

import java.util.ArrayList;
import java.util.List;

public class MarketDataPage {

    final WebDriver driver;

    @FindBy(id = "edit-acceptationbutton")
    private WebElement acceptanceButton;

    @FindBy(css = "button.btn.agree-button.eu-cookie-compliance-default-button")
    private WebElement agreeAllCookiesButton;

    @FindBy(id = "edit-actions-reset")
    private WebElement resetFiltersButton;

    @FindBy(id = "edit-filters-modality-auction")
    private WebElement auctionButton;

    @FindBy(id = "edit-filters-modality-continuous")
    private WebElement continuousButton;

    @FindBy(id = "edit-filters-modality-capacity")
    private WebElement capacityButton;

    @FindBy(id = "edit-filters-modality-mgo")
    private WebElement originButton;

    @FindBy(id = "edit-filters-sub-modality-dayahead")
    private WebElement dayaHeadButton;

    @FindBy(id = "edit-filters-sub-modality-intraday")
    private WebElement intraDayButton;

    @FindBy(id = "edit-filters-trading-date")
    private WebElement tradingDateButton;

    @FindBy(id = "edit-filters-trading-date")
    private WebElement deliveryDateButton;

    @FindBy(id = "edit-filters-product-60")
    private WebElement product60minButton;

    @FindBy(id = "edit-filters-product-30")
    private WebElement product30minButton;

    @FindBy(id = "edit-filters-data-mode-map")
    private WebElement viewMapButton;

    @FindBy(id = "edit-filters-data-mode-map")
    private WebElement viewTableButton;

    @FindBy(id = "edit-filters-data-mode-graph")
    private WebElement viewGraphButton;

    @FindBy(id = "edit-filters-data-mode-graph")
    private WebElement viewAggregatedCurvesButton;

    @FindBy(css = "div[class='item']")          // the day label
    private WebElement itemDiv2;

    @FindBy(css = "div[class~='timeline']")     // first hour block
    private WebElement itemDiv;

    //div[class~='timeline'] div.item .js-timeline-hour[data-value='01']
    @FindBy(css = "div[class~='timeline'] div.item .js-timeline-hour")
    private WebElement hourFilter;


    @FindBy(css = "js-map-values")
    private WebElement mapValues;

    @FindBy(css = "js-map-polygon")
    private WebElement mapPolygons;


    public MarketDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

     public void setCookie(String name, String value) {
        Cookie cookie = new Cookie(name, value);
        driver.manage().addCookie(cookie);
     }

    public void navigateToMarketDataPage() {
        // Need to fix this workaround
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        setCookie("epex-data-use-agreed", "1");
        setCookie("cookie-agreed", "2");
        setCookie("cookie-agreed-categories", "1");
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickAcceptanceButton() {
        acceptanceButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickAgreeAllCookiesButton() {
        agreeAllCookiesButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickResetButton() {
        resetFiltersButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickAuctionButton() {
        auctionButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickContinuousButton() {
        continuousButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickCapacityButton() {
        capacityButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickOriginButton() {
        originButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickDayaHeadButton() {
        dayaHeadButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickIntraDayButton() {
        intraDayButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickTradingDateButton() {
        tradingDateButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickDeliveryDateButton() {
        deliveryDateButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickProduct60minButton () {
        product60minButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickProduct30minButton() {
        product30minButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickViewMapButton() {
        viewMapButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickViewTableButton() {
        viewTableButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickViewGraphButton() {
        viewGraphButton.click();
        Wait.untilPageLoadComplete(driver);
    }

    public void clickViewAggregatedCurvesButton() {
        viewAggregatedCurvesButton.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public void clickOnTimelineFilterByHour(String hourFilter) {
        String selector = "div[class~='timeline'] div.item .js-timeline-hour[data-value='"+ hourFilter + "']";
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.click();
        Wait.untilPageLoadComplete(driver, 5L);
    }

    public List<MapValue> getMapValues() {
        List<MapValue> values = new ArrayList<>();

        // Should really check for null pointer / no such element here
        List<WebElement> elements = driver.findElements(By.cssSelector("g.js-map-values text"));
        for (WebElement element : elements) {
            String dataCode = element.getAttribute("data-code");
            String transform = element.getAttribute("transform");
            String price = element.getText();
            MapValue mapValue = new MapValue(dataCode, transform, price);
            values.add(mapValue);
        }
        printMapValues(values);
        return values;
    }

    public List<MapPolygon> getMapPolygons() {
        List<MapPolygon> polygons = new ArrayList<>();

        // Should really check for null pointer / no such element here
        List<WebElement> elements = driver.findElements(By.cssSelector("g.js-map-values polygon"));
        for (WebElement element : elements) {
            String dataCode = element.getAttribute("data-code");
            String points = element.getAttribute("points");
            MapPolygon polygon = new MapPolygon(Boolean.FALSE, dataCode, points);
            polygons.add(polygon);
        }
        printMapPolygons(polygons);
        return polygons;
    }

    public void printMapValues(List<MapValue> values) {
        for (MapValue v : values) {
            System.out.println(v.getDataCode() + " " + v.getTransform() + " " + v.getPrice());
        }
    }

    public void printMapPolygons(List<MapPolygon> polygons) {
        for (MapPolygon p : polygons) {
            System.out.println(p.getHasValue() + " " + p.getDataCode() + " ");
        }
    }
}
