import org.testng.annotations.Test;

public class ExampleTest extends BaseTest
{
    @Test
    public void loginToSberOnline() {
        app.loginPage.open();
        app.loginPage.wrongLogin("123456", "123456");
        app.restorePage.checkCardNumberField();
        logger.info("Test is passed");

    }
}
