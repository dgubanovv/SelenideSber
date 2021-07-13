package app;

import app.pages.LoginPage;
import app.pages.RestorePage;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/CSAFront/index.do#/");
    }

    public static RestorePage buildRestorePage() {
        return new RestorePage("/CSAFront/index.do#/registration");
    }
}
