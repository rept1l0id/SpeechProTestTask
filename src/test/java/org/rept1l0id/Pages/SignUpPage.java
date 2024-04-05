package org.rept1l0id.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SignUpPage {

    //signup form

    public static SelenideElement emailField = $x("//input[@type='email']");

    public static SelenideElement nameField = $x("//input[@name='name']");

    public static SelenideElement passwordField = $x("//input[@type='password']");

    public static SelenideElement signupButton = $x("//button[@class='button is-block is-info is-large is-fullwidth']");

    //navigation bar

    public static SelenideElement homePageButton = $x("//a[@href='/']");

    public static SelenideElement loginPageButton = $x("//a[@href='/login']");

    public static SelenideElement signUpPageButton = $x("//a[@href='/signup']");

}
