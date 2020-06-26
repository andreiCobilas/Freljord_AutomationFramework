package com.Freljord.Infrastructure.Helper.Navigation;


import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Check {

    private static final String className = String.valueOf(Check.class);

    public static void check(By locator) {

        selectCheckBox(Generics.getElement(locator));
        LoggerHelper.logAction("The :  " + locator + " is checked" , className);
    }

    public static void unCheck(By locator) {

        unSelectCheckBox(Generics.getElement(locator));
        LoggerHelper.logAction("The :  " + locator + " is unchecked" , className);
    }

    public static boolean isSelected (By locator) {

        LoggerHelper.logAction("The :  " + locator + " status" , className);
        return isSelected(Generics.getElement(locator));
    }

    private static boolean isSelected (WebElement element) {

        LoggerHelper.logAction("The :  " + element + " is selected" , className);
        return element.isSelected();
    }

    private static void selectCheckBox(WebElement element) {

        if(!isSelected(element))
            element.click();
        LoggerHelper.logAction("The :  " + element + " is checked" , className);
    }

    private static void unSelectCheckBox(WebElement element) {

        if( isSelected(element))
            element.click();
        LoggerHelper.logAction("The :  " + element + " is unchecked" , className);
    }
}
