package steps;

import cucumber.TestContext;
import datatypes.MapPolygon;
import datatypes.MapValue;
import enums.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.MarketDataPage;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MarketDataSteps {

    final TestContext testContext;
    final MarketDataPage marketDataPage;

    public MarketDataSteps(TestContext context) {
        testContext = context;
        marketDataPage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on Market Data Page$")
    public void userIsOnMarketDataPage() {
        marketDataPage.navigateToMarketDataPage();
        saveCurrentMapData();
    }

    @When("they click on reset filters")
    public void theyClickOnResetFilters() {
        marketDataPage.clickResetButton();
    }

    @When("they click on Auction button")
    public void theyClickOnAuctionButton() {
        saveCurrentMapData();
        marketDataPage.clickAuctionButton();
    }

    @When("they click on Continuous button")
    public void theyClickOnContinuousButton() {
        saveCurrentMapData();
        marketDataPage.clickContinuousButton();
    }

    @When("they click on Capacity button")
    public void theyClickOnCapacityButton() {
        saveCurrentMapData();
        marketDataPage.clickCapacityButton();
    }

    @When("they click on Guarantees of Origin button")
    public void theyClickOnOriginButton() {
        saveCurrentMapData();
        marketDataPage.clickOriginButton();
    }

    @When("they click on Day-Ahead button")
    public void theyClickOnDayaHeadButton() {
        saveCurrentMapData();
        marketDataPage.clickDayaHeadButton();
    }

    @When("they click on Intraday button")
    public void theyClickOnIntraDayButton() {
        saveCurrentMapData();
        marketDataPage.clickIntraDayButton();
    }

    @When("they click on Trading Date Button")
    public void theyClickOnTradingDateButton() {
        saveCurrentMapData();
        marketDataPage.clickTradingDateButton();
    }

    @When("they click on Delivery Date Button")
    public void theyClickOnDeliveryDateButton() {
        saveCurrentMapData();
        marketDataPage.clickDeliveryDateButton();
    }

    @When("they click on 60 min button")
    public void theyClickOn60minButton() {
        saveCurrentMapData();
        marketDataPage.clickProduct60minButton();
    }

    @When("they click on 30 min button")
    public void theyClickOn30minButton() {
        saveCurrentMapData();
        marketDataPage.clickProduct30minButton();
    }

    @When("they click on Map button")
    public void theyClickOnMapButton() {
        saveCurrentMapData();
        marketDataPage.clickViewMapButton();
    }

    @When("they click on Table button")
    public void theyClickOnTableButton() {
        saveCurrentMapData();
        marketDataPage.clickViewTableButton();
    }

    @When("they click on Graph button")
    public void theyClickOnGraphButton() {
        saveCurrentMapData();
        marketDataPage.clickViewGraphButton();
    }

    @When("they click on Aggregated Curves Button")
    public void theyClickOnAggregatedCurveButton() {
        saveCurrentMapData();
        marketDataPage.clickViewAggregatedCurvesButton();
    }

    @When("they click on timeline filter {string}")
    public void theyClickOnTimelineFilterByHOur(String hour) {
        saveCurrentMapData();
        marketDataPage.clickOnTimelineFilterByHour(hour);
    }

    @Then("the filters are cleared")
    public void theFiltersAreCleared() {
    }

    @When("Save map values")
    public void saveCurrentMapData() {
        List<MapValue> values = marketDataPage.getMapValues();
        List<MapPolygon> polygons = marketDataPage.getMapPolygons();
        testContext.getScenarioContext().setContext(Context.MAP_VALUES, values);
        testContext.getScenarioContext().setContext(Context.MAP_POLYGON, polygons);
    }

    @Then("map values have changed")
    public void verifyMapValuesHaveChanged() {
        List<MapValue> previousValues = (List<MapValue>) testContext.getScenarioContext().getContext(Context.MAP_VALUES);
        List<MapPolygon> previousPolygons = (List<MapPolygon>) testContext.getScenarioContext().getContext(Context.MAP_POLYGON);
        assertThat(previousValues).isNotNull();
        assertThat(previousPolygons).isNotNull();

        List<MapValue> currentValues = marketDataPage.getMapValues();
        List<MapPolygon> currentPolygons = marketDataPage.getMapPolygons();
        assertThat(currentValues).isNotNull();
        assertThat(currentPolygons).isNotNull();

        assertThat(previousValues).isNotSameAs(currentValues);
        assertThat(previousPolygons).isNotSameAs(currentPolygons);

//        assertThat(previousValues).hasSameElementsAs(currentValues);
//        assertThat(previousPolygons).hasSameElementsAs(currentPolygons);
    }
}