import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement autocomplete = driver.findElement(By.id("twotabsearchtextbox"));
        autocomplete.sendKeys("soap");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Thread.sleep(500);

        WebElement autocompleteResult = driver.findElement(By.cssSelector(".s-suggestion.s-suggestion-ellipsis-direction"));
        autocompleteResult.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
