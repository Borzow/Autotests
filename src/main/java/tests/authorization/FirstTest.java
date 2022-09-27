package tests.authorization;

import org.junit.Test;
import tests.WebDriverSettings;


public class FirstTest extends WebDriverSettings {

    @Test
    public void successfulAuthorization() {
        //stepOne // Заходим на сайт kaspersky -> переходим на окно авторизации/регистрации
        HomePage homePage = new HomePage(driver, wait);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver,wait);
        homePage.start();
        homePage.dropBox();
        homePage.MyKButton();
        //stepTwo Авторезируемся в аккаунт
        authorizationPage.setEmail();
        authorizationPage.setPass();
        authorizationPage.logInButton();
    }
}

