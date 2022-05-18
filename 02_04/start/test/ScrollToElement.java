import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Madhuparna");
        Thread.sleep(1000);

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("03/02/1997");
        Thread.sleep(1000);

        driver.quit();
    }
}
