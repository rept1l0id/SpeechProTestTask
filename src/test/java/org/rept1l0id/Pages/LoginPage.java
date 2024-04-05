package org.rept1l0id.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    //login form

    public static SelenideElement emailField = $x("//input[@type='email']");

    public static SelenideElement passwordField = $x("//input[@type='password']");

    public static SelenideElement rememberMeCheckBox = $x("//input[@type='checkbox']");

    public static SelenideElement loginButton = $x("//button[@class='button is-block is-info is-large is-fullwidth']");

    public static SelenideElement errorMessage = $x("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]");

    //navigation bar

    public static SelenideElement homePageButton = $x("//a[@href='/']");

    public static SelenideElement loginPageButton = $x("//a[@href='/login']");

    public static SelenideElement signUpPageButton = $x("//a[@href='/signup']");

}
