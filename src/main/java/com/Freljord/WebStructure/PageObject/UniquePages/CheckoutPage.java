package com.Freljord.WebStructure.PageObject.UniquePages;

import com.Freljord.Infrastructure.Driver.Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

    public CheckoutPage() {

        WebDriver driver = Setup.driver;
        driver.manage().window().maximize();
        PageFactory.initElements( driver, this );
    }

    //**Page Factory elements**//
    @FindBy(linkText = "Fashion")
    private WebElement category;

    @FindBy(xpath = "//*[@id='content']/div/div/div[4]/div/div/div/ul/li[3]/div/div[2]/div[3]/div[1]/button")
    private WebElement product;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div[4]/div/div/div/ul/li[3]/div/div[2]/div[3]/div[1]/button")
    private WebElement addToCartBtn;

    @FindBy(css = "div.ui-dialog.ui-corner-all.ui-widget.ui-widget-content.ui-front.default-dialog.has-title.add2cartpopup")
    private WebElement popUp;

    @FindBy(linkText = "Checkout")
    private WebElement checkoutBtn;

    @FindBy(css = "#content > div > div > div.signin-main-wrapper")
    private WebElement loginPage;

    @FindBy(id = "login-email")
    private WebElement emailField;

    @FindBy(id = "login-password")
    private WebElement passwordField;

    @FindBy(css = "form.login-form .submit")
    private WebElement signInBtn;

    @FindBy(xpath = "//*[@id='content']/div/div/div[2]/sections/div[1]")
    private WebElement shippingPage;

    @FindBy(css = "#method2")
    private WebElement courierBtn;

    @FindBy(css = "#content > div > div > div.checkout_fastlane_container > sections > div.checkout_fastlane_sections.section-shipping > div.checkout_fastlane_details_wrapper > div.checkout_fastlane_details_box > div.checkout_fastlane_details_right > section-change-button > div > div.next-button > next-button > button")
    private WebElement proceedPaymentBtn;

    @FindBy(xpath = "//*[@id='content']/div/div/div[2]/sections/div[1]")
    private WebElement paymentPage;

    @FindBy(id = "pmethod29")
    private WebElement chooseMethod;

    @FindBy(id = "pmethod30")
    private WebElement useSavedCard;

    @FindBy(className = "btn regular-button regular-main-button checkout_fastlane_section-place_order place-order")
    private WebElement placeOrder;

    @FindBy(id = "page-title")
    private WebElement invoiceSuccess;

    @FindBy(css = "#header-bar > div.dropdown.header_bar-my_account > a")
    private WebElement myAccountLink;

    @FindBy(linkText = "Log out")
    private WebElement logout;

    @FindBy (linkText ="View cart")
    private WebElement viewCart;

    @FindBy(css = "#cart-right > ul > li.button.main-button > button")
    private WebElement gotToCheckout;

    @FindBy(id = "method4")
    private WebElement localPickup;

    @FindBy(id = "pmethod6")
    private WebElement cashOnDelivery;

    @FindBy(linkText = "Sign in / sign up")
    private WebElement signIn;

    @FindBy(className = "product-cell box-product")
    private WebElement clickOnProduct;

    @FindBy(css = "#form-1590134444020 > div.product-buttons.shade-base > div > div.add-button-wrapper.widget-fingerprint-product-add-button > button")
    private WebElement addToCartFromProductPage;

    //**Getters**//
    public WebElement getCategory() {
        return category;
    }

    public WebElement getProduct() {
        return product;
    }

    public WebElement getPopUp() {
        return popUp;
    }

    public WebElement getCheckoutBtn() {
        return checkoutBtn;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getLoginPage() {
        return loginPage;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSignInBtn() {
        return signInBtn;
    }

    public WebElement getCourierBtn() {
        return courierBtn;
    }

    public WebElement getShippingPage() {
        return shippingPage;
    }

    public WebElement getProceedPaymentBtn() {
        return proceedPaymentBtn;
    }

    public WebElement getPaymentPage() {
        return paymentPage;
    }

    public WebElement getChooseMethod() {
        return chooseMethod;
    }

    public WebElement getInvoiceSuccess() {
        return invoiceSuccess;
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public WebElement getViewCart() {
        return viewCart;
    }

    public WebElement getGotToCheckout() {
        return gotToCheckout;
    }

    public WebElement getUseSavedCard() {
        return useSavedCard;
    }

    public WebElement getLocalPickup() {
        return localPickup;
    }

    public WebElement getCashOnDelivery() {
        return cashOnDelivery;
    }

    public WebElement getSignIn() {
        return signIn;
    }

    public WebElement getClickOnProduct() {
        return clickOnProduct;
    }

    public void getAddtoCartFromproductPage() {
        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,750)");
        new WebDriverWait(Setup.driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form-1590141850299 > div.product-buttons.shade-base > div > div.add-button-wrapper.widget-fingerprint-product-add-button > button"))).click();
    }

    public void getPlaceOrder() {
        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,750)");
        new WebDriverWait(Setup.driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("place-order > button"))).click();
    }

    public void getLogout() {
        new WebDriverWait(Setup.driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown.header_bar-my_account > a"))).click();
        new WebDriverWait(Setup.driver,3).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown.header_bar-my_account.open > ul > li.account-link-logoff > a"))).click();
    }
}
