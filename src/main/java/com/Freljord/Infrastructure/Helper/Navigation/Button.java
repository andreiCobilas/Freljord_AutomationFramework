package com.Freljord.Infrastructure.Helper.Navigation;


import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import org.openqa.selenium.By;

public class Button {

    private static final String className = String.valueOf(Button.class);

    public static void clickButton(By locator){

        Generics.getElement(locator ).click();
        LoggerHelper.logAction("The :  " + locator + " is clicked" , className);
    }
}
