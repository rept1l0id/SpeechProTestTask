package org.rept1l0id.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {

    //welcome message

    public static SelenideElement welcomeMessage = $x("//h1[@class='title']");

    //navigation bar

    public static SelenideElement homePageButton = $x("//a[@href='/']");

    public static SelenideElement profilePageButton = $x("//a[@href='/profile']");

    public static SelenideElement logoutPageButton = $x("//a[@href='/logout']");

}
