package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public SelenideElement loginField = $(By.name("login"));
    public SelenideElement passwordField = $(By.name("password"));
    public SelenideElement passwordError = $(By.id("password-error"));
    public SelenideElement passwordRestoreLink = $(By.linkText("восстановите доступ"));

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void wrongLogin(String login, String password) {
        loginField.setValue(login);
        passwordField.setValue(password).pressEnter();
        passwordError.should(Condition.exist);
        passwordRestoreLink.click();
        Driver.waitForUrlContains("registration");
    }
}
