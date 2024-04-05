package org.rept1l0id.Steps;

import org.rept1l0id.Pages.LoginPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    @Step("Open \"Login\" page")
    public static void openLoginPage(String url){
        open(url);
    }

    @Step("Insert e-mail in \"E-Mail\" field")
    public static void insertMail(String email){
        LoginPage.emailField.setValue(email);
    }

    @Step("Insert password in \"Password\" field")
    public static void insertPassword(String password){
        LoginPage.passwordField.setValue(password);
    }

    @Step("Click \"Remember me\" button")
    public static void clickRememberMeButton(){
        LoginPage.rememberMeCheckBox.click();
    }

    @Step("Click on \"Login\" button")
    public static void clickLoginButton(){
        LoginPage.loginButton.click();
    }

}
