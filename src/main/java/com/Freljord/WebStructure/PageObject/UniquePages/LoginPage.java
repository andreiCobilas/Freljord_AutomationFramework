package com.Freljord.WebStructure.PageObject.UniquePages;


import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.Wait;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends DefaultPage {

    public LoginPage() {
        this.driver = Setup.driver;
        this.driver.manage().window().setSize(new Dimension(1024, 768));
        this.wait = new Wait(this.driver);
    }

    //**Page Factory elements**//
    @FindBy(xpath = "//*[@id='header-bar']/div[3]/button/span")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id='login-email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='login-password']")
    private WebElement passwordField;

    @FindBy(css = "form.login-form .submit")
    private WebElement signInBtn;

    @FindBy(css = "div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title")
    private WebElement popUp;

    @FindBy(css = "div.header_settings.dropdown.open > div")
    private WebElement preferencesMenu;

    @FindBy(css = "div.header_settings.dropdown.open > div > ul.sign-in_block > li > button")
    private WebElement signInBtnFromPreferencesMenuBtn;

    @FindBy(css = "div.block.block-block.block-featured-products > div > div > div > ul > li:nth-child(1) > div")
    private WebElement product;

    @FindBy(xpath = "//*[@id='content']/div/div/div[4]/div/div/div/ul/li[1]/div/div[2]/div[3]/div[1]/button/span")
    private WebElement addBtn;

    @FindBy(linkText = "Checkout")
    private WebElement checkoutBtn;

    //**Getters**//
    public WebElement getSignInButton() {

        return signInBtn;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSignInBtn() {
        return signInBtn;
    }

    public WebElement getSignInBtnFromPreferencesMenuBtn() {
        return signInBtnFromPreferencesMenuBtn;
    }

    public WebElement getProduct() {

        return product;
    }

    public WebElement getAddBtn() {

        return addBtn;
    }

    public WebElement getCheckoutBtn() {

        return checkoutBtn;
    }

    public WebElement checkoutBtn() {

        return checkoutBtn;
    }

    public WebElement getPopUp() {

        return popUp;
    }

    public WebElement getPreferencesMenu() {

        return preferencesMenu;
    }

    public WebElement errorMessageDisplayed() {
        return null;
    }

}
