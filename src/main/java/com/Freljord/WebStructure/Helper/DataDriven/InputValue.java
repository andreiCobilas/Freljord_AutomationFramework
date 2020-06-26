package com.Freljord.WebStructure.Helper.DataDriven;


import com.Freljord.Infrastructure.Helper.Utility.Resource;
import com.Freljord.WebStructure.PageObject.UniquePages.LoginPage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.ClassToInstanceMap;

import java.io.IOException;

public class InputValue {
//
//    private ClassToInstanceMap<Object> FileReaderManager;
//    private static final LoginPage loginPage = new LoginPage();
//
//    public void returnInputValue(String typeOfInput) throws IOException {
//
///*        switch (typeOfInput) {
//            case "loginValidData":
//            case "loginInvalidData":
//            case "registerInvalidData":
//        }*/
//
//
//        User[] users = JsonReader.fromJSON(new TypeReference<User[]>() {
//        }, Resource.getResourcePath("testdata\\users.json"));
//        User[] invalidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
//        }, Resource.getResourcePath("testdata\\invalidUser.json"));
//
//        switch (typeOfInput) {
//            case "email":
//                loginPage.getEmailField().sendKeys(users[0].email);
//                break;
//            case "password":
//                loginPage.getPasswordField().sendKeys(users[0].password);
//                break;
//            case "emailInvalid":
//                loginPage.getEmailField().sendKeys(invalidUser[0].email);
//            default:
//                throw new IllegalArgumentException("Following " + typeOfInput + "  field not found ");
//        }
//    }
}
