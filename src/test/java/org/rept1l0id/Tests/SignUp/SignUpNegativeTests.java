package org.rept1l0id.Tests.SignUp;

import io.qameta.allure.Owner;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.rept1l0id.PageURLs.urlEnumes;
import org.rept1l0id.Steps.SignUpSteps;
import org.rept1l0id.Tests.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

@Slf4j
@Owner("Kuzmin Nikita")
public class SignUpNegativeTests extends BaseTest {

    @Test(testName = "Sign up without password",
            description = "Generate credentials. Sign up without inserting password. " +
                    "Check actual url.")
    public void signupWithoutPassword(){
        log.info("Open signup page");
        SignUpSteps.openSignupPage(urlEnumes.SIGNUP_PAGE_UPL.url());

        log.info("Create credentials");
        String email = RandomStringUtils.random(6, true, true) + "@mail.ru";

        log.info("Insert credentials");
        SignUpSteps.insertMail(email);
        SignUpSteps.clickSignupButton();

        webdriver().shouldHave(urlContaining(urlEnumes.SIGNUP_PAGE_UPL.url()));
    }

    @Test(testName = "Sign up without email",
            description = "Generate credentials. Sign up without inserting email. " +
                    "Check actual url.")
    public void signupWithoutEmail(){
        log.info("Open signup page");
        SignUpSteps.openSignupPage(urlEnumes.SIGNUP_PAGE_UPL.url());

        log.info("Create credentials");
        String password = RandomStringUtils.random(6, true, true);

        log.info("Insert credentials");
        SignUpSteps.insertPassword(password);
        SignUpSteps.clickSignupButton();

        webdriver().shouldHave(urlContaining(urlEnumes.SIGNUP_PAGE_UPL.url()));
    }

}
