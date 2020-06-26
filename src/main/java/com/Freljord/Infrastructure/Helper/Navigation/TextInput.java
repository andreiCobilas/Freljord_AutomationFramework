package com.Freljord.Infrastructure.Helper.Navigation;

import com.Freljord.Infrastructure.Helper.Utility.Generics;

import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import org.openqa.selenium.By;

public class TextInput {

    private static final String className = String.valueOf(TextInput.class);

    public static void sendKeys(By locator, String value) {

        Generics.getElement(locator).sendKeys(value);
        LoggerHelper.logAction("Following : " + value + "data is send to : " + locator , className);
    }

    public static void clear(By locator) {

        Generics.getElement(locator).clear();
        LoggerHelper.logAction("Following field : " + locator  + "is cleared", className);
    }

    public static String getText(By locator) {

        LoggerHelper.logAction("Text from : " + locator  + "is : " + Generics.getElement(locator).getText(), className);
        return Generics.getElement(locator).getText();
    }
}
