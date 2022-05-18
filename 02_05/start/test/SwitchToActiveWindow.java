import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement button = driver.findElement(By.id("new-tab-button"));
        button.click();

        Thread.sleep(2000);

        String ogHandle = driver.getWindowHandle();

        for (String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }

        Thread.sleep(2000);

        driver.switchTo().window(ogHandle);

        Thread.sleep(2000);

        driver.close();
        Thread.sleep(2000);

        driver.quit();
    }
}
