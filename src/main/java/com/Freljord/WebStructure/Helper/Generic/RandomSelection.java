package com.Freljord.WebStructure.Helper.Generic;

import com.Freljord.Infrastructure.Helper.Navigation.Click;
import com.Freljord.Infrastructure.Helper.Utility.HashMapUtils;
import com.Freljord.Infrastructure.Helper.Utility.LoggerHelper;

import org.openqa.selenium.By;

public class RandomSelection {

    public static int randomNumberGenerator(int min, int max){

        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static void randomCategorySelect(){

        int random_category = randomNumberGenerator(1,3);

        switch ( random_category ){

            case 1:
                Click.clickGeneric(By.linkText("Beauty & Health") );
                HashMapUtils.write("Beauty & Health" );
                LoggerHelper.logAction("Beauty & Health category accessed", "RandomSelection.class");
                break;

            case 2:
                Click.clickGeneric( By.linkText("Fashion") );
                HashMapUtils.write("Fashion");
                LoggerHelper.logAction("Fashion category accessed","RandomSelection.class");
                break;

            case 3:
                Click.clickGeneric( By.linkText("Electronics") );
                HashMapUtils.write("Electronics");
                LoggerHelper.logAction("Electronics category accessed","RandomSelection.class");
                break;

            default:
                break;
        }
    }
}
