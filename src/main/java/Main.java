import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Homr\\IdeaProjects\\myProject\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.avito.ru/rossiya/avtomobili?cd=1&radius=0");

        WebElement element = driver.findElement(By.xpath("(//a[text() = 'Личные вещи'])[1]"));

        String par = element.getAttribute("href");

        System.out.println(par);
    }
}

