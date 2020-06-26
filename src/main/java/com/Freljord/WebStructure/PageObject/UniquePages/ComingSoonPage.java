package com.Freljord.WebStructure.PageObject.UniquePages;


import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComingSoonPage extends DefaultPage {

    public ComingSoonPage(){

        WebDriver driver = Setup.driver;
        PageFactory.initElements( driver, this );
    }

    //**Page Factory elements**//
    @FindBy(className = "grid icon-gridview")
    private WebElement gridElementBtn;

    //**Getters**//
    public WebElement getGridElementBtn() {
        return gridElementBtn;
    }
}
