package com.Freljord.WebStructure.TestSteps.CreateAccountSteps;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Helper.Navigation.Navigation;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import com.Freljord.WebStructure.Helper.Generic.GenericData;
import com.Freljord.WebStructure.PageObject.UniquePages.CreateAccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class CreateAccountSteps  {

    private final CreateAccountPage createAccountPage = new CreateAccountPage();

    GenericData genericData = new GenericData(createAccountPage);
    JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
    String className="CreateAccountSteps.class";

    @When("{string} button is clicked")
    public void userClicksSignInButton(String arg0) {

        createAccountPage.getSignInBtn().click();
        LoggerHelper.logAction("Button "+arg0+" is clicked", className);
    }

    @Then("{string} is displayed")
    public void popUpIsDisplayed(String element) {

        createAccountPage.getPopUp().click();
        LoggerHelper.logAction(Navigation.getTitle()+" is displayed", className);
    }

    @When("{string} link is clicked")
    public void linkIsClicked(String arg0) {

        scroll.executeScript("window.scrollBy(0,1000)");
        createAccountPage.getCreateAccountBtn().click();
        LoggerHelper.logAction("Create account button is clicked",className);
    }

    @Then("{string} create new account is displayed")
    public void newAccountPopUpIsDisplayed(String arg0) {

        Setup.driver.getWindowHandle();
        LoggerHelper.logAction("New account pop up is displayed",className);
    }

    @When("User enters {string} data in {string} field on {string} page")
    public void userEntersDataInFieldOnEmail(String input, String field, String page) throws IOException {

        genericData.enterTestData(input, field, page);
        LoggerHelper.logAction(input+" was input in "+ field+ " field on the "+page+" page",className);
    }

    @And("{string} button from form is clicked")
    public void creatButtonIsPressed(String arg0) {

        createAccountPage.getCreateBtn().click();
        LoggerHelper.logAction("Create account button is clicked",className);
    }

    @Then("The success message is displayed")
    public void myAccountPageIsDisplayed() {

        createAccountPage.getWarningMessage().getText();
        LoggerHelper.logAction("Warning message for creating account is displayed",className);
    }

    @Then("The error message is displayed")
    public void anErrorMessageIsDisplayed() {

        createAccountPage.getErrorMessage().getText();
        LoggerHelper.logAction( "Error message is displayed", className);
    }

    @Then("The email error message is displayed")
    public void theEmailErrorMessageIsDisplayed() {

        createAccountPage.getEmailErrorMessage().getText();
        LoggerHelper.logAction("Email error message is displayed",className);
    }

    @And("The fields are cleared")
    public void theFieldsIsCleared() {

        createAccountPage.getCloseErrorMessage().click();
        createAccountPage.getEmailField().clear();
        createAccountPage.getPasswordField().clear();
        createAccountPage.getConfirmPasswordField().clear();
        LoggerHelper.logAction("Fields are cleared", className);
    }

    @When("User clicks on the preferences menu button after scroll")
    public void userClicksOnLoginButtonAfterScroll() {

        scroll.executeScript("window.scrollBy(0,1000)");
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header']/div[2]/a")));
        createAccountPage.getPreferencesMenuBtn().click();
        LoggerHelper.logAction("User clicks on login button after scroll",className);
    }

    @Then("{string} is expanded")
    public void preferencesMenuDisplayed(String arg0) {

        createAccountPage.menuIsDisplayed();
        LoggerHelper.logAction(arg0+"is expanded",className);
    }

    @When("User clicks on {string} button from preferences menu")
    public void userClicksOnButtonFromPreferencesMenu(String arg0) {
        createAccountPage.getSignInButtonFromPreferencesMenuBtn().click();
        LoggerHelper.logAction("User clicks on button from preferences menu",className);
    }
}
