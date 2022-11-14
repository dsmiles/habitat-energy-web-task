package managers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WebBrowserManager {
    private WebDriver driver;
    private static BrowserType browserType;

    public WebBrowserManager() {
        browserType = FileReaderManager.getInstance().getConfigReader().getBrowser();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = createLocalDriver();
        }
        return driver;
    }

    private WebDriver createLocalDriver() {
        switch (browserType) {
            case FIREFOX :
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case CHROME :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case EDGE :
                WebDriverManager.edgedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                throw new RuntimeException("Unknown driver type");
        }

        if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) {
            driver.manage().window().maximize();
        }

        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitWait(), TimeUnit.SECONDS);

        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }
}