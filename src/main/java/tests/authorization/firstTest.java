package tests.authorization;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import tests.WebDriverSettings;


public class firstTest extends WebDriverSettings {

    @Test
    public void first() {
        WindowAuthorization windowAuthorization = PageFactory.initElements(driver, WindowAuthorization.class);
        //stepOne // Заходим на сайт kaspersky -> переходим на окно авторизации/регистрации
        windowAuthorization.start();
        windowAuthorization.dropBox();
        windowAuthorization.MyKButton();
        //stepTwo

    }
}

