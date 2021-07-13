package app;

import app.pages.LoginPage;
import app.pages.RestorePage;

public class App {

    public LoginPage loginPage;
    public RestorePage restorePage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        restorePage = PageBuilder.buildRestorePage();

    }
}
