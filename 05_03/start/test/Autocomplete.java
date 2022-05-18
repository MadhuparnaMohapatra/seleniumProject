import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/ref=nav_logo");

        WebDriverWait wait = new WebDriverWait(driver,20);

        WebElement autocomplete = driver.findElement(By.id("twotabsearchtextbox"));
        autocomplete.sendKeys("Soap");
        //Thread.sleep(1000);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-suggestion.s-suggestion-ellipsis-direction")));

        WebElement autocompleteResult = driver.findElement(By.cssSelector(".s-suggestion.s-suggestion-ellipsis-direction"));
        autocompleteResult.click();

        driver.quit();
    }
}
