package com.Freljord.WebStructure.PageObject.DefaultPages;

import com.Freljord.Infrastructure.Driver.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultProductPage extends DefaultPage {

    public DefaultProductPage(){

        WebDriver driver = Setup.driver;
        PageFactory.initElements( driver, this );
    }

    //**Page Factory default elements**//
    @FindBy(xpath = "//*[contains(@class,'quantity-box-container')]/input")
    private WebElement quantityBoxInput;

    @FindBy (className = "product-items-available")
    private WebElement inStockInfo;

    @FindBy(xpath = "//div[contains(@class,'add-button')]/button")
    private WebElement addToCartBtn;

    @FindBy(linkText = "Checkout")
    private WebElement checkoutBtn;

    //**Getters**//
    public WebElement getQuantityBoxInput () {

        return quantityBoxInput;
    }

    public WebElement getInStockInfo () {

        return inStockInfo;
    }

    public WebElement getAddToCartBtn () {

        return addToCartBtn;
    }

    public WebElement getCheckoutBtn () {

        return checkoutBtn;
    }
}
