package org.rept1l0id.Tests.Login;

import io.qameta.allure.Owner;
import lombok.extern.slf4j.Slf4j;
import org.rept1l0id.PageURLs.urlEnumes;
import org.rept1l0id.Steps.AssertionSteps;
import org.rept1l0id.Steps.LoginSteps;
import org.rept1l0id.Tests.BaseTest;
import org.testng.annotations.Test;

@Owner("Kuzmin Nikita")
@Slf4j
public class LoginNegativeTests extends BaseTest {

    @Test(testName = "Login without email",
            description = "Login without inserting email. Check actual url. Check message.")
    public void loginWithoutPasswordTest(){
        log.info("Open login page");
        LoginSteps.openLoginPage(urlEnumes.LOGIN_PAGE_URL.url());

        log.info("Insert credentials");
        LoginSteps.insertPassword("1111");
        LoginSteps.clickLoginButton();

        log.info("Check actual url");
        AssertionSteps.checkUrl(urlEnumes.LOGIN_PAGE_URL.url());

        log.info("Check error message");
        String expectedMessage = "Please check your login details and try again.";
        AssertionSteps.checkActualMessage(expectedMessage);
    }

    @Test(testName = "Login without password",
            description = "Login without inserting password. Check actual url. Check message.")
    public void loginWithoutEmailTest(){
        log.info("Open login page");
        LoginSteps.openLoginPage(urlEnumes.LOGIN_PAGE_URL.url());

        log.info("Insert credentials");
        LoginSteps.insertMail("kit-kikit@rambler.ru");
        LoginSteps.clickLoginButton();

        log.info("Check actual url");
        AssertionSteps.checkUrl(urlEnumes.LOGIN_PAGE_URL.url());

        log.info("Check error message");
        String expectedMessage = "Please check your login details and try again.";
        AssertionSteps.checkActualMessage(expectedMessage);
    }
}
