package com.Freljord.WebStructure.TestSteps.AddToCartSteps;


import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.Wait;
import com.Freljord.Infrastructure.Helper.Navigation.Click;
import com.Freljord.Infrastructure.Helper.Navigation.Navigation;
import com.Freljord.Infrastructure.Helper.Utility.Generics;
import com.Freljord.Infrastructure.Helper.Utility.HashMapUtils;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import com.Freljord.WebStructure.Helper.Generic.GenericData;
import com.Freljord.WebStructure.Helper.Generic.RandomSelection;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultProductPage;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddToCartSteps {

    private final DefaultProductPage defaultProductPage = new DefaultProductPage();
    private final Wait wait = new Wait(Setup.driver);
    private final DefaultShoppingCartPage cart = new DefaultShoppingCartPage();
    private final String className = "AddToCartSteps.class";

    GenericData genericData = new GenericData(defaultProductPage);

    @Given("Random product is clicked")
    public void productIsClicked() {

        Random randomGenerator = new Random();
        List<WebElement> objLinks = Setup.driver.findElements(By.xpath("//*[contains(@class,'items-list')]//div//li//h5/a[@class='fn url']"));
        int index = randomGenerator.nextInt(objLinks.size());
        objLinks.get(index).click();
        LoggerHelper.logAction("A random product is clicked", className);
    }

    @When("A {string} category is clicked")
    public void aCategoryIsClicked(String type) {

        if (Generics.isElementPresent(By.linkText(type))) {
            Click.clickLink(type);
            LoggerHelper.logAction(type + " category is clicked ", className);
        } else if (type.equals("Random")) {
            RandomSelection.randomCategorySelect();
        } else throw new IllegalArgumentException("Selected " + type + "  category doesn't exist");
    }

    @When("Quantity field is populated with data that exceed the stock availability")
    public void quantityFieldIsPopulatedWithDataThatExceedTheStockAvailability() {

        wait.forElementToBeDisplayed(5000, defaultProductPage.getQuantityBoxInput(), "Quantity input");
        defaultProductPage.getQuantityBoxInput().sendKeys(String.valueOf(HashMapUtils.readInt()
                + RandomSelection.randomNumberGenerator(1, 100)));
        LoggerHelper.logAction("Quantity " + HashMapUtils.readInt() + " input ", className);
    }

    @When("Quantity field is populated with {string}")
    public void quantityFieldIsPopulatedWithInvalidInput(String input) {

        wait.forElementToBeDisplayed(5000, defaultProductPage.getQuantityBoxInput(), "Quantity input");
        defaultProductPage.getQuantityBoxInput().sendKeys(input);
        LoggerHelper.logAction("Quantity " + input + " input", className);
    }

    @When("Quantity field is populated with data that equals the maximum stock availability")
    public void quantityFieldIsPopulatedWithDataThatEqualsTheMaximumStockAvailability() {

        wait.forElementToBeDisplayed(5000, defaultProductPage.getQuantityBoxInput(), "Quantity input");
        defaultProductPage.getQuantityBoxInput().clear();
        defaultProductPage.getQuantityBoxInput().sendKeys(String.valueOf(HashMapUtils.readInt()));
        LoggerHelper.logAction("Maxim value for quantity input", className);
    }

    @When("{string} button is clicked")
    public void buttonIsClicked(String button) {

        Click.clickGeneric(By.cssSelector(".item-buttons > a:nth-child(1) > span:nth-child(1)"));
        LoggerHelper.logAction("Button " + button + " clicked", className);
    }

    @Then("{string} category page is displayed")
    public void categoryPageIsDisplayed(String type) {

        if (type.equals("Beauty & Health") || type.equals("Fashion") || type.equals("Electronics")) {
            assertThat("Page title is  ", Navigation.getTitle(), is(DefaultPage.baseTitle + type));
            LoggerHelper.logAction(" Category" + type + "is displayed", className);
        } else if (type.equals("Random")) {
            assertThat("Page title is", Navigation.getTitle(), is(DefaultPage.baseTitle + HashMapUtils.read()));
        } else throw new IllegalArgumentException("Selected " + type + "  category doesn't exist");
    }

    @Then("User can't add product to the cart")
    public void userCanTAddProductToTheCart() {

        try {
            defaultProductPage.getAddToCartBtn().click();
            LoggerHelper.logAction("User cant add product to the cart", className);
        } catch (Exception exception) {

            System.out.println("Exception " + exception.getMessage());
        }
    }

    @Then("Random product page is displayed")
    public void randomProductPageIsDisplayed() {

        wait.forElementToBeDisplayed(100, defaultProductPage.getQuantityBoxInput(), "Quantity input");
        assertThat(" You are on product page " + Navigation.getTitle(),
                true, is(defaultProductPage.getQuantityBoxInput().isDisplayed()));
        LoggerHelper.logAction(Navigation.getTitle() + " is displayed", className);
    }

    @Then("User clicks {string} from product page")
    public void userClicks(String button) {

        wait.forElementToBeDisplayed(5000, defaultProductPage.getAddToCartBtn(), button);
        defaultProductPage.getAddToCartBtn().click();
        LoggerHelper.logAction("user clicks on the button " + button, className);
    }

    @Then("{string} page is displayed")
    public void pageIsDisplayed(String title) {

        assertThat("Page title is", Navigation.getTitle(), is(DefaultPage.baseTitle + title));
        LoggerHelper.logAction(Navigation.getTitle() + " page is displayed", className);
    }

    @Then("Your Shopping Cart page is displayed")
    public void yourShoppingCartPageIsDisplayed() {

        wait.forElementToBeDisplayed(5000, cart.getDeleteBtn(), "Delete button");
        assertThat(true, is(cart.getDeleteBtn().isDisplayed()));
        LoggerHelper.logAction("Shopping cart is displayed", className);
    }

    @Then("Item is deleted from cart")
    public void itemIsDeletedFromCart() {

        wait.forElementToBeDisplayed(2000, cart.getYourCartIsEmptyMess(), "Your cart is empty mess");
        assertThat(true, is(cart.getYourCartIsEmptyMess().isDisplayed()));
        LoggerHelper.logAction("Item is deleted from cart", className);
    }

    @And("in stock amount is checked")
    public void inStockAmountIsChecked() {

        wait.forElementToBeDisplayed(5000, defaultProductPage.getQuantityBoxInput(), "Quantity input");
        HashMapUtils.writeInt(Integer.parseInt(defaultProductPage.getInStockInfo().getText().replaceAll(
                "[\\D]", "")));
        LoggerHelper.logAction("Check available stock", className);
    }

    @When("User enters {string} data in {string} field on {string} page")
    public void userFillsField(String input, String field, String page) throws IOException {
        genericData.enterTestData(input, field, page);
        LoggerHelper.logAction(input + " was input in " + field + " field on the " + page + " page", className);
    }

    @When("User clicks delete item from cart")
    public void userClicksDeleteItemFromCart() {

        wait.forElementToBeDisplayed(5000, cart.getDeleteBtn(), "Delete button");
        cart.getDeleteBtn().click();
        LoggerHelper.logAction("Delete items from cart", className);
    }

    @When("Changes the quantity of products to {string}")
    public void changesTheQuantityOfProductsTo(String number) {

        cart.getQuantityBoxInput().clear();
        cart.getQuantityBoxInput().sendKeys(number);
        LoggerHelper.logAction("Quatity is changed to " + number, className);
    }

    @And("{string} pop-up is displayed")
    public void popUpIsDisplayed(String popUp) {

        wait.forElementToBeDisplayed(5000, defaultProductPage.getCheckoutBtn(), popUp);
        defaultProductPage.getCheckoutBtn().isDisplayed();
        LoggerHelper.logAction(popUp + " pop up is displayed", className);
    }


    @Then("Number of product is changed to {string}")
    public void numberOfProductIsChanged(String number) {

        wait.forElementToBeDisplayed(200, cart.getQuantityBoxInput(), " quantity box");
        assertThat(number, is(cart.getQuantityBoxInput().getText()));
        LoggerHelper.logAction(" Number of products is changet to " + number, className);
    }


}
