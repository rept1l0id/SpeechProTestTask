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

@Owner("Kuzmin Nikita")
@Slf4j
public class SignUpPositiveTests extends BaseTest {

    @Test(testName = "Sign up without name",
            description = "Generate credentials. Sign up without inserting name. " +
                    "Check actual url.")
    public void signupWithoutNameTest(){
        log.info("Open signup page");
        SignUpSteps.openSignupPage(urlEnumes.SIGNUP_PAGE_UPL.url());

        log.info("Create credentials");
        String email = RandomStringUtils.random(6, true, true) + "@mail.ru";
        String password = RandomStringUtils.random(6, true, true);

        log.info("Insert credentials");
        SignUpSteps.insertMail(email);
        SignUpSteps.insertPassword(password);
        SignUpSteps.clickSignupButton();

        webdriver().shouldHave(urlContaining(urlEnumes.LOGIN_PAGE_URL.url()));
    }

    @Test(testName = "Sign up with name",
            description = "Generate credentials. SignUp with inserting name. " +
                    "Check actual url.")
    public void signupWithNameTest() {
        log.info("Open signup page");
        SignUpSteps.openSignupPage(urlEnumes.SIGNUP_PAGE_UPL.url());

        log.info("Create credentials");
        String email = RandomStringUtils.random(6, true, true) + "@mail.ru";
        String name = RandomStringUtils.random(6, true, false);
        String password = RandomStringUtils.random(6, true, true);

        log.info("Insert credentials");
        SignUpSteps.insertMail(email);
        SignUpSteps.insertName(name);
        SignUpSteps.insertPassword(password);
        SignUpSteps.clickSignupButton();

        webdriver().shouldHave(urlContaining(urlEnumes.LOGIN_PAGE_URL.url()));
    }

}
