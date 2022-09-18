package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class firstTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Homr\\IdeaProjects\\myProject\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void after() {
        //driver.quit();
    }

    @Test
    public void firstTest() {// todo понять как организовать шаги в тесте
        void stepOne // Заходим на сайт kaspersky -> переходим на окно авторизации/регистрации
        {
            driver.get("https://www.kaspersky.ru/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"AlreadyCustomer_wrapper__2P-ph AlreadyCustomer_v2__YQKJK\"]")));
            WebElement dropBox = driver.findElement(By.xpath("//div[@class=\"AlreadyCustomer_wrapper__2P-ph AlreadyCustomer_v2__YQKJK\"]"));
            dropBox.click();
            WebElement MyK = driver.findElement(By.xpath("//a[@href=\"https://my.kaspersky.com/\"]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://my.kaspersky.com/\"]")));
            MyK.click();
        }

        void stepTwo ()
        {
            driver.get("https://www.kaspersky.ru/");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"AlreadyCustomer_wrapper__2P-ph AlreadyCustomer_v2__YQKJK\"]")));
            WebElement dropBox = driver.findElement(By.xpath("//div[@class=\"AlreadyCustomer_wrapper__2P-ph AlreadyCustomer_v2__YQKJK\"]"));
            dropBox.click();
            WebElement MyK = driver.findElement(By.xpath("//a[@href=\"https://my.kaspersky.com/\"]"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://my.kaspersky.com/\"]")));
            MyK.click();
        }
    }
}

