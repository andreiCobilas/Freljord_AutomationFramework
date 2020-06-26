package com.Freljord.Infrastructure.Driver;

import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Wait {

    private final String className = String.valueOf(getClass());
    private final WebDriver driver;

    public Wait(WebDriver driver) {

        this.driver = driver;
    }

    private void waitUntilCondition(ExpectedCondition <?> condition, String timeoutMessage, int timeout) {

        WebDriverWait wait = new WebDriverWait( driver, timeout );
        wait.withMessage( timeoutMessage );
        wait.until( condition );
        LoggerHelper.logAction("The condition is : " + condition + "the time is :" +timeout , className);
    }

    public void forElementToBeDisplayed(int timeout, WebElement webElement, String webElementName) {

        ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf( webElement );
        String timeoutMessage = webElementName + " wasn't displayed after " +  timeout + " seconds.";
        waitUntilCondition( condition, timeoutMessage, timeout );
    }

    public void forPresenceOfElements(int timeout, By elementLocator, String elementName) {

        ExpectedCondition<List<WebElement>> condition = ExpectedConditions.presenceOfAllElementsLocatedBy( elementLocator );
        String timeoutMessage = elementName + " elements were not displayed after " + timeout  + " seconds.";
        waitUntilCondition( condition, timeoutMessage, timeout );
    }
}
