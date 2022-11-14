package dataproviders;

import enums.BrowserType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private final Properties properties;
    private final String propertyFilePath = "configs//configuration.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties not found at " + propertyFilePath);
        }
    }

    public long getImplicitWait() {
        String implicitWait = properties.getProperty("implicitWait");
        if (implicitWait != null) {
            return Long.parseLong(implicitWait);
        }
        else {
            throw new RuntimeException("implicitWait not specified in the configuration.properties file.");
        }
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        }
        else {
            throw new RuntimeException("url not specified in the configuration.properties file.");
        }
    }

    public BrowserType getBrowser() {
        String browserName = properties.getProperty("browser");

        switch (browserName.toLowerCase()) {
            case "firefox":
                return BrowserType.FIREFOX;
            case "chrome":
                return BrowserType.CHROME;
            case "edge":
                return BrowserType.EDGE;
            default:
                throw new RuntimeException("Browser Name Key value in configuration.properties not found : " + browserName);
        }
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if (windowSize != null) {
            return Boolean.valueOf(windowSize);
        }
        else {
            return true;
        }
    }

    public String getTestDataResourcePath() {
        String testDataResourcePath = properties.getProperty("testDataResourcePath");
        if (testDataResourcePath!= null) {
            return testDataResourcePath;
        }
        else {
            throw new RuntimeException("Test Data Resource Path not specified in the configuration.properties file for the Key:testDataResourcePath");
        }
    }

    public String getReportConfigPath() {
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if (reportConfigPath!= null) {
            return reportConfigPath;
        }
        else {
            throw new RuntimeException("Report Config Path not specified in the configuration.properties file for the Key:reportConfigPath");
        }
    }
}