package cucumber;

import managers.PageObjectManager;
import managers.WebBrowserManager;

public class TestContext {

    private final WebBrowserManager webBrowserManager;
    private final PageObjectManager pageObjectManager;
    private final ScenarioContext scenarioContext;

    public TestContext() {
        webBrowserManager = new WebBrowserManager();
        pageObjectManager = new PageObjectManager(webBrowserManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebBrowserManager getWebBrowserManager() {
        return webBrowserManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}