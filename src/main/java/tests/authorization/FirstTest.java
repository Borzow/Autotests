package tests.authorization;

import org.junit.Test;
import tests.WebDriverSettings;


public class FirstTest extends WebDriverSettings {
    final String pass = "nZhu)abOT2O3"; // todo спрятать лог/пас
    final String log = "automation1testing@mail.ru";
    @Test
    public void firstTest() {
        //stepOne // Заходим на сайт kaspersky -> переходим на окно авторизации/регистрации
        HomePage homePage = new HomePage(driver, wait);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver,wait);
        homePage.start();
        homePage.dropBox();
        homePage.MyKButton();
        //stepTwo
        authorizationPage.setEmail(log);
        authorizationPage.setPass(pass);
        authorizationPage.logInButton();
    }
}

