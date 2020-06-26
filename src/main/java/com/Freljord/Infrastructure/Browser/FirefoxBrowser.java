package com.Freljord.Infrastructure.Browser;

import com.Freljord.Infrastructure.Helper.Utility.Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class FirefoxBrowser {

    public static WebDriver getFirefoxDriver(){

        System.setProperty("webdriver.gecko.driver", Objects.requireNonNull(Resource.getResourcePath("driver\\geckodriver.exe")));
        return new FirefoxDriver();
    }

}
