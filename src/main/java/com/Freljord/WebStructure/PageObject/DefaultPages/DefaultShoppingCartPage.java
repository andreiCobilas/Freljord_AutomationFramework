package com.Freljord.WebStructure.PageObject.DefaultPages;


import com.Freljord.Infrastructure.Driver.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultShoppingCartPage extends DefaultPage {

    public DefaultShoppingCartPage() {
        WebDriver driver = Setup.driver;
        PageFactory.initElements( driver, this );
    }

    //**Page Factory default elements**//
    @FindBy(className = "remove")
    private WebElement deleteBtn;

    @FindBy(xpath = "//*[@id=\"page-title\"]")
    private WebElement yourCartIsEmptyMess;

    @FindBy(xpath = "//*[contains(@class,'quantity-box-container')]/input")
    private WebElement quantityBoxInput;

    //**Getters**//
    public WebElement getQuantityBoxInput(){

        return quantityBoxInput;
    }

    public WebElement getYourCartIsEmptyMess(){

        return yourCartIsEmptyMess;
    }
    public WebElement getDeleteBtn(){

        return deleteBtn;
    }
}
