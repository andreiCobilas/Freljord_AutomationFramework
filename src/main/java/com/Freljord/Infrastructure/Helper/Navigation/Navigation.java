package com.Freljord.Infrastructure.Helper.Navigation;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;

public class Navigation {

    private static final String className = String.valueOf(Navigation.class);

    public static void navigateTo(String url) {

        Setup.driver.get(url );
        LoggerHelper.logAction("Navigate to: " + url , className);

    }

    public static String getTitle() {
        LoggerHelper.logAction("The title is " + Setup.driver.getTitle() , className);
        return Setup.driver.getTitle();
    }

    public static String getCurrentUrl() {

        LoggerHelper.logAction("The URL is " + Setup.driver.getCurrentUrl() , className);
        return Setup.driver.getCurrentUrl();
    }
}
