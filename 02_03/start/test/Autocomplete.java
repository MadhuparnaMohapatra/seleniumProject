import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement autocomplete = driver.findElement(By.id("twotabsearchtextbox"));
        autocomplete.click();
        autocomplete.sendKeys("Soap");
        Thread.sleep(2000);

        //WebElement soap = driver.findElement(By.className("s-suggestion-ellipsis-direction"));
        //soap.click();

        //autocomplete.sendKeys(Keys.DOWN);
        //autocomplete.sendKeys(Keys.ENTER);

        //autocomplete.sendKeys(Keys.DOWN, Keys.ENTER);



        Thread.sleep(5000);


        driver.quit();
    }
}
