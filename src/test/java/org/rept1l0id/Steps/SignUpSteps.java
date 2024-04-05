package org.rept1l0id.Steps;

import io.qameta.allure.Step;
import org.rept1l0id.Pages.SignUpPage;

import static com.codeborne.selenide.Selenide.open;

public class SignUpSteps {

    @Step("Open \"Login\" page")
    public static void openSignupPage(String url){
        open(url);
    }

    @Step("Insert e-mail in \"E-Mail\" field")
    public static void insertMail(String email){
        SignUpPage.emailField.setValue(email);
    }

    @Step("Insert password in \"Password\" field")
    public static void insertPassword(String password){
        SignUpPage.passwordField.setValue(password);
    }

    @Step("Click \"Remember me\" button")
    public static void insertName(String name){
        SignUpPage.nameField.setValue(name);
    }

    @Step("Click on \"Login\" button")
    public static void clickSignupButton(){
        SignUpPage.signupButton.click();
    }

}
