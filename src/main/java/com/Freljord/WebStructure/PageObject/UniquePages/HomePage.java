package com.Freljord.WebStructure.PageObject.UniquePages;

import com.Freljord.Infrastructure.Driver.Setup;
import com.Freljord.WebStructure.PageObject.DefaultPages.DefaultPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DefaultPage {

    public HomePage(){
        WebDriver driver = Setup.driver;
        PageFactory.initElements(driver, this );
    }
}
