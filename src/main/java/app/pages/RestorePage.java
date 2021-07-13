package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class RestorePage extends BasePage {

    public SelenideElement cardNumberField = $(By.id("cardNumber"));

    public RestorePage(String pageUrl) {
        super(pageUrl);
    }

    public void checkCardNumberField() {
        cardNumberField.should(Condition.exist);
    }
}
