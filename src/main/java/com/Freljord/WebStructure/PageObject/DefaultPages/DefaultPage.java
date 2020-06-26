package com.Freljord.WebStructure.PageObject.DefaultPages;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.Wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage {

    protected WebDriver driver;
    protected Wait wait;

    public static String baseTitle = "X-Cart Demo store company > ";

    public DefaultPage() {

        this.driver = Setup.driver;
        this.wait = new Wait( this.driver );
        PageFactory.initElements( driver, this );
    }
    //**Page Factory default elements**//

    //Navigation elements
    @FindBy(linkText = "Home")
    private WebElement homeBtn;

    @FindBy(linkText = "Shipping")
    private WebElement shippingBtn;

    @FindBy(linkText = "Contact us" )
    private WebElement contactUsBtn;

    @FindBy(linkText = "New!")
    private WebElement newBtn;

    @FindBy(linkText = "Coming soon")
    private WebElement comingSoonBtn;

    //Sign-In
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[4]/div[1]/div/div[2]/div[3]/button/span")
    private WebElement singInBtn;

    @FindBy(id = "login-email")
    private WebElement loginMailInput;

    @FindBy(id = "login-password")
    private WebElement loginPasswordInput;

    //**Getters**//
    public WebElement getHomeBtn() {

        return homeBtn;
    }

    public WebElement getShippingBtn() {

        return shippingBtn;
    }

    public WebElement getContactUsBtn() {

        return contactUsBtn;
    }

    public WebElement getNewBtn() {

        return newBtn;
    }

    public WebElement getComingSoonBtn() {

        return comingSoonBtn;
    }

    public WebElement getSingInBtn() {

        return singInBtn;
    }

    public WebElement getLoginMailInput() {

        return loginMailInput;
    }

    public WebElement getLoginPasswordInput() {

        return loginPasswordInput;
    }
}
