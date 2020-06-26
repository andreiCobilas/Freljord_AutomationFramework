package com.Freljord.WebStructure.TestSteps.DefaultSteps;

import com.Freljord.Infrastructure.Helper.Navigation.Click;
import com.Freljord.Infrastructure.Helper.Navigation.Navigation;
import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import com.Freljord.WebStructure.Helper.Generic.UrlAddress;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import java.util.InputMismatchException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultSteps {

    String className = "DefaultSteps.class";

    @Given("User is on homepage")
    public void userIsOnHomePage() {

        Navigation.navigateTo(UrlAddress.homePage);
         LoggerHelper.logAction("User is on homepage", className);
    }

    @And("User Clicks {string} on Navigation Bar")
    public void navigationBarClick (String button) {
       if(Generics.isElementPresent(By.partialLinkText(button )  ) ) {
            Click.clickGeneric(By.partialLinkText(button ) );
           LoggerHelper.logAction("User clicks on "+button+" button",className);
        }
        else throw new InputMismatchException( "No such element found;" );
    }

    @Then("{string} page is opened")
    public void pageIsOpened (String name) {
        assertThat( "Page title is  ", Navigation.getTitle(), is(DefaultPage.baseTitle + name ) );
        LoggerHelper.logAction("Page "+name+ " is displayed",className);
    }
}
