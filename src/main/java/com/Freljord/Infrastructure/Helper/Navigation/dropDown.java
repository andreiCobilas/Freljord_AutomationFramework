package com.Freljord.Infrastructure.Helper.Navigation;

import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class dropDown {

    private static final String className = String.valueOf(dropDown.class);

    public static void selectElementByIndex(By locator,int index) {

        Select select = new Select(Generics.getElement(locator));
        select.selectByIndex(index);
        LoggerHelper.logAction("The dropDown :" + locator + " at position " + index +" is clicked" , className);
    }
}
