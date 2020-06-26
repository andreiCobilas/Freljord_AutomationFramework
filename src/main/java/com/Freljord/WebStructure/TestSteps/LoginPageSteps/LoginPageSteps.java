package com.Freljord.WebStructure.TestSteps.LoginPageSteps;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.Wait;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import com.Freljord.WebStructure.Helper.Generic.GenericData;
import com.Freljord.WebStructure.PageObject.UniquePages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();
    private final Wait wait = new Wait(Setup.driver);
    JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
    Actions actions = new Actions(Setup.driver);
    GenericData genericData = new GenericData(loginPage);
    String className = "LoginPageSteps.class";

    @When("User clicks on Login button")
    public void userClicksSignInButton() {

        loginPage.getSignInButton().click();
        LoggerHelper.logAction("User clicks on Sign in button", className);
    }

    @When("User enters {string} data in {string} field on {string} page")
    public void userFillsField(String input, String field, String page) throws IOException {

        genericData.enterTestData(input, field, page);
        LoggerHelper.logAction(input+" in "+field+ " field on the "+page+" page",className);
    }

    @When("User clicks on the preferences menu button after scroll")
    public void userClicksOnLoginButtonAfterScroll() {

        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,1000)");
        loginPage.getPreferencesMenu().click();
        LoggerHelper.logAction("User clicks on login button from preferences menu",className);
    }

    @When("User clicks on {string} button from preferences menu")
    public void userClicksOnButtonFromPreferencesMenu(String arg0) {

        loginPage.getSignInBtnFromPreferencesMenuBtn().click();
        LoggerHelper.logAction(arg0+" button is clicked",className);
    }

    @When("User clicks on add {string}")
    public void userClicksOnAdd(String arg0) {

        scroll.executeScript("window.scrollBy(0,750)");
        actions.moveToElement(loginPage.getProduct()).build().perform();
        actions.moveToElement(loginPage.getAddBtn()).build().perform();
        loginPage.getAddBtn().click();
        LoggerHelper.logAction("User clicks on add to cart button",className);
    }

    @When("{string} button is clicked by user")
    public void checkOutButtonIsClicked(String arg0) {

        loginPage.getCheckoutBtn().click();
        LoggerHelper.logAction(arg0+ "button is clicked",className);
    }

    @And("User enters {string} data in {string} field in {string} page")
    public void userEntersDataInFieldOnPage(String input, String field, String page) throws IOException {

        genericData.enterTestData(input, field, page);
        LoggerHelper.logAction(input +" input in "+field+" field on the "+page+" page",className);
    }

    @And("{string} button is clicked")
    public void userClicksOnSignInButton(String element) {

       // wait.forLoading(7);
        loginPage.getSignInBtn().click();
        LoggerHelper.logAction(element+" button is clicked",className);
    }

    @Then("{string} is displayed")
    public void popUpisDisplayed(String element) {

        loginPage.getPopUp();
        LoggerHelper.logAction(element+ " is displayed",className);
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
       // wait.forLoading(10);
        Setup.driver.getPageSource().contains("My account");
        LoggerHelper.logAction("User is logged in",className);
    }

    @Then("the error message is displayed")
    public void theErrorMessageIsDisplayed() {

        loginPage.errorMessageDisplayed();
        LoggerHelper.logAction("Error message is displayed",className);
    }

    @Then("{string} is expanded")
    public void preferencesMenuDisplayed(String arg0) {

        loginPage.getPreferencesMenu().isDisplayed();
        LoggerHelper.logAction(arg0+" is expanded",className);
    }

    @Then("{string} with {string} button is displayed")
    public void popUpWithCheckoutButtonIsDisplay(String arg0, String arg1) {

        loginPage.checkoutBtn();
        LoggerHelper.logAction("Pop up with checkout button is displayed",className);
    }

    @Then("{string} form is displayed")
    public void formIsDisplayeddd(String arg0) {

        Setup.driver.getCurrentUrl().contains("Log in to your account");
        LoggerHelper.logAction(arg0+" is displayed",className);
    }
}
