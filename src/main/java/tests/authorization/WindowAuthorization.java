package tests.authorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WindowAuthorization {
    WebDriver driver;
    WebDriverWait wait;

    public WindowAuthorization(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void start(){
        driver.get("https://www.kaspersky.ru/");
    }
    public void dropBox() { // придумать название
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"AccesibilityButton_button__2QjPj AlreadyCustomer_button__X0UTa\"]")));
        WebElement dropBox = driver.findElement(By.xpath("//button[@class=\"AccesibilityButton_button__2QjPj AlreadyCustomer_button__X0UTa\"]"));
        dropBox.click();
    }

    public void MyKButton() {
        WebElement MyK = driver.findElement(By.xpath("//a[@href=\"https://my.kaspersky.com/\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"https://my.kaspersky.com/\"]")));
        MyK.click();
    }

}
