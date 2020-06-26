package com.Freljord.Infrastructure.Driver;

import com.Freljord.Infrastructure.Helper.Utility.DateTime;
import com.Freljord.Infrastructure.Helper.Utility.HashMapUtils;

import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class TearDown {

    private final WebDriver driver;
    private final String className = String.valueOf(getClass());

    public TearDown() {

        this.driver = Setup.driver;
    }

    @After
    public void quitDriver(Scenario scenario){

        this.driver.quit();
        HashMapUtils.clear();
        HashMapUtils.clearInt();
        LoggerHelper.logAction("This scenario : " + scenario + "ended, on" + DateTime.getCurrentDateTime(), className);
    }
}
