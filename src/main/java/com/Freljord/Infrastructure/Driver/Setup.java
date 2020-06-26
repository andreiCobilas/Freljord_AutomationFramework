package com.Freljord.Infrastructure.Driver;

import com.Freljord.Infrastructure.Browser.BrowserType;
import com.Freljord.Infrastructure.Browser.ChromeBrowser;
import com.Freljord.Infrastructure.Browser.FirefoxBrowser;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Setup {

    public static WebDriver driver;
    private final String className = String.valueOf(getClass());

    @Before
    public void setWebDriver() {

        String browser = System.getProperty("browser");

        if (browser == null) {
            browser = String.valueOf(BrowserType.chrome );
        }

        switch (browser) {
            case "chrome":
                driver = ChromeBrowser.getChromeDriver();
                LoggerHelper.logAction("The " + browser + " is selected" , className);
                break;

            case "firefox":
                driver = FirefoxBrowser.getFirefoxDriver();
                LoggerHelper.logAction("The " + browser + " is selected" , className);
                break;

            default:
                throw new IllegalArgumentException("Selected " + browser + "  isn't supported.");
        }
    }
}


