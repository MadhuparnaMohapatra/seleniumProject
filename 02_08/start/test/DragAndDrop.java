import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.automationtesting.in/Static.html");

        WebElement angular = driver.findElement(By.id("angular"));
        WebElement mongo = driver.findElement(By.id("mongo"));
        WebElement node = driver.findElement(By.id("node"));

        WebElement dropBox = driver.findElement(By.className("dragged"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(angular,dropBox).build().perform();
        actions.dragAndDrop(mongo,dropBox).build().perform();
        actions.dragAndDrop(node,dropBox).build().perform();

        driver.quit();
    }
}

