package org.rept1l0id.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public static SelenideElement homePageButton = $x("//a[@href='/']");

    //authorized home page navigation bar

    public static SelenideElement loginPageButton = $x("//a[@href='/login']");

    public static SelenideElement signUpPageButton = $x("//a[@href='/signup']");

    //unauthorized home page navigation bar

    public static SelenideElement profilePageButton = $x("//a[@href='/profile']");

    public static SelenideElement logoutPageButton = $x("//a[@href='/logout']");


}
