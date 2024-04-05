package org.rept1l0id.Steps;

import com.codeborne.selenide.Conditional;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.rept1l0id.Pages.LoginPage;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class AssertionSteps {

    @Step()
    public static Conditional<WebDriver> checkUrl(String actualUrl){
        return webdriver().shouldHave(urlContaining(actualUrl));
    }

    @Step()
    public static void checkActualMessage(String expectedMessage){
        String actualMessage = LoginPage.errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
