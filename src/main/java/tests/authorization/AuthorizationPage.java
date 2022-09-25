package tests.authorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationPage {//todo оптимизировать Xpath
    WebDriver driver;
    WebDriverWait wait;
    public AuthorizationPage(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void setEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"email\"]")));
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
    }
    public void setPass(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]")));
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
    }
    public void logInButton(){
        driver.findElement(By.xpath("//button[@class=\"u-button u-button_align_center is-stretched a-center-sm a-margin-top-4x u-button_type_primary\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-at-selector=\"accountMenuTrigger\"]")));
    }

}
