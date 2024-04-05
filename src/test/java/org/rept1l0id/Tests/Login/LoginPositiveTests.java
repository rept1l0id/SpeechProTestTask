package org.rept1l0id.Tests.Login;

import io.qameta.allure.Owner;
import lombok.extern.slf4j.Slf4j;
import org.rept1l0id.PageURLs.urlEnumes;
import org.rept1l0id.Steps.LoginSteps;
import org.rept1l0id.Tests.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;


@Owner("Kuzmin Nikita")
@Slf4j
public class LoginPositiveTests extends BaseTest {


    @Test(testName = "Login without \"Remember me\"",
            description = "Login without clicking \"Remember me\". Check actual url.")
    public void loginWithoutRememberMeTest(){
        log.info("Open login page");
        LoginSteps.openLoginPage(urlEnumes.LOGIN_PAGE_URL.url());

        log.info("Insert credentials");
        LoginSteps.insertMail("kit-kikit@rambler.ru");
        LoginSteps.insertPassword("1111");
        LoginSteps.clickLoginButton();

        log.info("Check login");
        webdriver().shouldHave(urlContaining(urlEnumes.PROFILE_PAGE_URL.url()));
    }

    @Test(testName = "Login with \"Remember me\"",
            description = "Login with clicking \"Remember me\". Check actual url.")
    public void loginWithRememberMeTest(){
        log.info("Open login page");
        LoginSteps.openLoginPage(urlEnumes.LOGIN_PAGE_URL.url());

        log.info("Insert credentials");
        LoginSteps.insertMail("kit-kikit@rambler.ru");
        LoginSteps.insertPassword("1111");
        LoginSteps.clickRememberMeButton();
        LoginSteps.clickLoginButton();

        log.info("Check login");
        webdriver().shouldHave(urlContaining(urlEnumes.PROFILE_PAGE_URL.url()));
    }

}
