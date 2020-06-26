package com.Freljord.WebStructure.TestSteps.CheckoutSteps;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.TearDown;
import com.Freljord.Infrastructure.Driver.Wait;
import com.Freljord.Infrastructure.Helper.Navigation.Click;
import com.Freljord.Infrastructure.Helper.Navigation.Navigation;
import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.HashMapUtils;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import com.Freljord.WebStructure.Helper.Generic.RandomSelection;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;
import com.Freljord.WebStructure.PageObject.UniquePages.CheckoutPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutSteps {

    CheckoutPage checkout = new CheckoutPage();
    private final Wait wait = new Wait(Setup.driver);
    String className = "Checkout.class";
    TearDown tearDown=new TearDown();


    @When("A {string} category is clicked")
    public void a_category_is_clicked(String type) {

        if (Generics.isElementPresent(By.linkText(type))) {
            Click.clickLink(type);
            LoggerHelper.logAction("Category " + type + " accessed", className);
        } else if (type.equals("Random")) {
            RandomSelection.randomCategorySelect();
        } else throw new IllegalArgumentException("Selected " + type + "  category doesn't exist");

    }

    @When("User clicks on Sign in button on Home page")
    public void userClicksOnSignInButtonOnHomePage() {
        wait.forElementToBeDisplayed(5000, checkout.getSignIn(), "SignIn button");
        checkout.getSignIn().click();
        LoggerHelper.logAction("User clicked on Sign in button", className);
    }

    @When("User clicks on Checkout button")
    public void userClicksOnCheckoutButton() {
        wait.forElementToBeDisplayed(5000, checkout.getCheckoutBtn(), "CheckoutBtn");
        checkout.getCheckoutBtn().click();
        LoggerHelper.logAction("User clicks on checkout", className);
    }

    @When("User clicks on Local Shipping radio button")
    public void userClicksOnShippingMethod() {
        // wait.forLoading(2);
        checkout.getCourierBtn().click();
        // wait.forLoading(2);
        LoggerHelper.logAction("Local Shipping selected", className);
    }

    @When("User clicks on Credit or debit card via X-Payments DEMO radio button")
    public void userClicksOnCreditOrDebitCardViaXPaymentsDEMORadioButton() {
        //  wait.forLoading(2);
        checkout.getChooseMethod().click();
        LoggerHelper.logAction("User select payment via debit card", className);
        //  wait.forLoading(2);
    }

    @When("User clicks on View cart button")
    public void userClicksOnViewCartButton() {
        //  wait.forLoading(2);
        checkout.getViewCart().click();
        LoggerHelper.logAction("User clicks in View cart button", className);
    }

    @When("User clicks on Courier radio button")
    public void userClicksOnCourierRadioButton() {

        checkout.getCourierBtn().click();
        LoggerHelper.logAction("Courier shipping method selected", className);
    }

    @When("User clicks on used a saved card radio button")
    public void userClicksOnUsedASavedCardRadioButton() {

        checkout.getUseSavedCard().click();
        LoggerHelper.logAction("User use a saved card", className);
    }

    @When("User clicks on local Pickup radio button")
    public void userClicksOnLocalPickupRadioButton() throws InterruptedException {
        //  wait.forLoading(2);
        checkout.getLocalPickup().click();
        LoggerHelper.logAction("local Pickup shipping method selected", className);
    }

    @When("User clicks on Cash on delivery radio button")
    public void userClicksOnCashOnDeliveryRadioButton() {
        //  wait.forLoading(2);
        checkout.getCashOnDelivery().click();
        LoggerHelper.logAction("Cash type of payment selected", className);
    }

    @And("User clicks on place order button")
    public void userClicksOnPlaceOrderButton() {

        checkout.getPlaceOrder();
        LoggerHelper.logAction("User placed order", className);
    }

    @And("User click on Logout button")
    public void userClickOnLogoutButton() {

        checkout.getLogout();
        LoggerHelper.logAction("user logged out", className);
    }

    @And("User clicks on product")
    public void userClicksOnProduct() {

        checkout.getClickOnProduct().click();
        LoggerHelper.logAction("User selected product", className);
    }

    @And("User clicks on Go to checkout button")
    public void userClicksOnGoToCheckoutButton() {

        checkout.getGotToCheckout().click();
        LoggerHelper.logAction("User clicked on go to checkout", className);
    }

    @And("User add product to cart")
    public void userAddProductToCart() {

        checkout.getAddtoCartFromproductPage();
        LoggerHelper.logAction("User added to cart a product", className);
    }

    @And("User clicks on Proceed to payment button")
    public void userClicksOnProceedToPaymentButton() {

        wait.forElementToBeDisplayed(2,checkout.getProceedPaymentBtn(),"ProceedPaymentBtn");
        checkout.getProceedPaymentBtn().click();
        wait.forElementToBeDisplayed(2,checkout.getProceedPaymentBtn(),"ProceedPaymentBtn");
        LoggerHelper.logAction("Payment method selected", className);
    }

    @And("User selects product")
    public void userSelectsProduct() {

        JavascriptExecutor scroll = (JavascriptExecutor) Setup.driver;
        scroll.executeScript("window.scrollBy(0,750)");
        Actions actions = new Actions(Setup.driver);
        actions.moveToElement(checkout.getProduct()).build().perform();
        wait.forElementToBeDisplayed(10,checkout.getProduct(),"product");
        actions.moveToElement(checkout.getAddToCartBtn()).build().perform();
        checkout.getAddToCartBtn().click();
        LoggerHelper.logAction("Product successfully selected", className);
    }

    @And("Pop-up is displayed")
    public void popUpIsDisplayed() {
        wait.forElementToBeDisplayed(5,checkout.getPopUp(),"popUp");
        //checkout.getPopUp().getText().contains("You have just added");
        LoggerHelper.logAction("Pop up is displayed", className);


    }

    @And("Login page is displayed")
    public void loginPageIsDisplayed() {
        // checkout.getLoginPage().getText().contains("My Account");
    }

    @And("User fills Password field with {string}")
    public void userFillsPasswordField(String password) {

        checkout.getPasswordField().sendKeys(password);
        LoggerHelper.logAction("User filled password", className);
    }

    @And("User clicks on Sign in button")
    public void userClicksOnSignInButton() {

        checkout.getSignInBtn().click();
        LoggerHelper.logAction("User logged in", className);
    }

    @Then("Shipping page is diplayed")
    public void checkoutPagesIsDiplayed() {

        //checkout.getShippingPage().getText();
        //Assertion
        // wait.forLoading(2);
        LoggerHelper.logAction("Shipping page is displayed", className);
    }

    @Then("Payment page is displayed")
    public void paymentPageIsDisplayed() {

        //checkout.getPaymentPage().getText();
        LoggerHelper.logAction("Payment page displayed", className);
    }

    @Then("{string} category page is displayed")
    public void categoryPageIsDisplayed(String type) {

        if (type.equals("Beauty & Health") || type.equals("Fashion") || type.equals("Electronics")) {
            assertThat("Page title is  ", Navigation.getTitle(), is(DefaultPage.baseTitle + type));
            LoggerHelper.logAction("User added product is on page " + Navigation.getTitle(), className);
        } else if (type.equals("Random")) {
            assertThat("Page title is", Navigation.getTitle(), is(DefaultPage.baseTitle + HashMapUtils.read()));
        } else throw new IllegalArgumentException("Selected " + type + "  category doesn't exist");
    }

    @Then("User fills Email field with {string}")
    public void userFillsEmailField(String email) {

        checkout.getEmailField().click();
        LoggerHelper.logAction("User filled email", className);
    }

    @Then("Invoice page is displayed")
    public void invoicePageIsDisplayed() {

        //checkout.getInvoiceSuccess().getText();
        //Assert
        LoggerHelper.logAction("User is on onvoice page", className);
    }
}




