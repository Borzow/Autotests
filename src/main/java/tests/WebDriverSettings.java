package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSettings {
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
        driver.quit();
    }
}
