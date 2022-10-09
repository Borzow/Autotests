package tests;

import org.junit.Test;
import tests.authorization.AuthorizationPage;
import tests.authorization.HomePage;


public class AuthorizationTests extends WebDriverSettings {

    @Test
    public void successfulAuthorization() {
        //stepOne // Заходим на сайт kaspersky -> переходим на окно авторизации/регистрации
        HomePage homePage = new HomePage(driver, wait);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver,wait);
        homePage.start();
        homePage.dropBox();
        homePage.myKButton();
        //stepTwo Авторезируемся в аккаунт
        authorizationPage.setEmail("automation1testing@mail.ru"); // я понимаю, что это не очень(очень) не безопасно, но это автотесты и зачем кому то тестовый аккаунт ?
        authorizationPage.setPass("nZhu)abOT2O3");
        authorizationPage.logInButtonSuccess();
    }
    @Test
    public void unSuccessfulAuthorization(){
        //stepOne // Заходим на сайт kaspersky -> переходим на окно авторизации/регистрации
        HomePage homePage = new HomePage(driver, wait);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver,wait);
        homePage.start();
        homePage.dropBox();
        homePage.myKButton();
        //stepTwo попытка авторизации в аккаунт, с неверным лог/пас
        authorizationPage.setEmail("utomation1testing@mail.ru");
        authorizationPage.setPass("Zhu)abOT2O3");
        authorizationPage.logInButtonUnSuccess();
    }
}

