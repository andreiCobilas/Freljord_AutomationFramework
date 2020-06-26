package com.Freljord.WebStructure.PageObject.UniquePages;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.Wait;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAccountPage extends DefaultPage {

    public CreateAccountPage() {

        this.driver = Setup.driver;
        this.driver.manage().window();
        this.wait = new Wait(this.driver);
    }

    //**Page Factory elements**//
    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement signInBtn;

    @FindBy(css = "div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title")
    private WebElement popUp;

    @FindBy(css = "a.popup-button.default-popup-button.create-account-link")
    private WebElement createAccountBtn;

    @FindBy(css = "#login")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "password-conf")
    private WebElement confirmPasswordField;

    @FindBy(css = "div.model-form-buttons > div > button")
    private WebElement createBtn;

    @FindBy(css = "li.info")
    private WebElement warningMessage;

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/a")
    private WebElement signInDropDown;

    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement loginBtn;

    @FindBy(css = "li.error")
    private WebElement errorMessage;

    @FindBy(css = "p.error")
    private WebElement emailErrorMessage;

    @FindBy(xpath = "//*[@id='header']/div[2]/a")
    private WebElement preferencesMenuBtn;

    @FindBy(css = "div.header_settings.dropdown.open > div > ul.sign-in_block > li > button")
    private WebElement signInButtonFromPreferencesMenuBtn;

    @FindBy(css = "#status-messages > a")
    private WebElement closeErrorMessage;

    //**Getters**//
    public WebElement getSignInBtn() {
        return signInBtn;
    }

    public WebElement getCreateAccountBtn() {
        return createAccountBtn;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public WebElement getCreateBtn() {
        return createBtn;
    }

    public WebElement getPreferencesMenuBtn() {
        return preferencesMenuBtn;
    }

    public WebElement getSignInButtonFromPreferencesMenuBtn() {
        return signInButtonFromPreferencesMenuBtn;
    }

    public WebElement getCloseErrorMessage() {
        return closeErrorMessage;
    }

    public WebElement getPopUp() {
        return popUp;
    }

    public WebElement getWarningMessage() {
        return warningMessage;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }

    public WebElement menuIsDisplayed() {
        return preferencesMenuBtn;
    }
}
