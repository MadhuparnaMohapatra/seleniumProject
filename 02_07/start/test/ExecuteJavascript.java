import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        Thread.sleep(1000);

        //Alert alert = driver.switchTo().alert();
        //alert.accept();
        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",closeButton);


        Thread.sleep(1000);

        driver.quit();
    }
}
