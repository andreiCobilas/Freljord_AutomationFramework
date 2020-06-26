package com.Freljord.Infrastructure.Helper.Navigation;

import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import org.openqa.selenium.By;

public class Click {

    private static final String className = String.valueOf(Click.class);

    public static void clickGeneric (By locator){

        Generics.getElement(locator ).click();
        LoggerHelper.logAction("The :  " + locator + " is clicked" , className);
    }

    public static void clickLink(String linkText) {

        Generics.getElement(By.linkText(linkText)).click();
        LoggerHelper.logAction("The link :  " + linkText + " is clicked" , className);
    }

    public static void clickPartialLink(String partialLinkText) {

        Generics.getElement(By.partialLinkText(partialLinkText)).click();
        LoggerHelper.logAction("The  partial link :  " + partialLinkText + " is clicked" , className);
    }
}
