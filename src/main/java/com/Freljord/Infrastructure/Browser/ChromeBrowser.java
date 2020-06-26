package com.Freljord.Infrastructure.Browser;

import com.Freljord.Infrastructure.Helper.Utility.Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class ChromeBrowser {
   public static WebDriver getChromeDriver(){

       ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("disable-features=NetworkService");
       chromeOptions.addArguments("['start-maximized']");
       System.setProperty("webdriver.chrome.driver", Objects.requireNonNull(Resource.getResourcePath("driver\\chromedriver.exe" ) ) );
       return new ChromeDriver(chromeOptions);
   }
}
