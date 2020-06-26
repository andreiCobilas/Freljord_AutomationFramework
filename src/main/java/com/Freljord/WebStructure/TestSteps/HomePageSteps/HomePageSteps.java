package com.Freljord.WebStructure.TestSteps.HomePageSteps;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.Infrastructure.Driver.Wait;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;
import com.Freljord.WebStructure.PageObject.UniquePages.HomePage;
import io.cucumber.java.en.And;


public class HomePageSteps {

    private final HomePage homePage = new HomePage();
    private final Wait wait = new Wait(Setup.driver );
    String className = "HomePageSteps.class";


    @And("Sign in is clicked")
    public void signInIsClicked() {

        this.homePage.getSingInBtn().click();
        LoggerHelper.logAction("User clicks on Sign in button", className);
    }

    @And("{string} is entered")
    public void isEntered(String mail) throws InterruptedException {

        this.wait.forElementToBeDisplayed( 10, homePage.getLoginMailInput(), mail );
        this.homePage.getLoginMailInput().sendKeys( mail );
        LoggerHelper.logAction("Email "+mail+" input",className);
    }

    @And("{string} are entered")
    public void inputEntered(String password) {

        this.homePage.getLoginPasswordInput().sendKeys( password );
        LoggerHelper.logAction("Password "+password+" input",className);
    }

}
