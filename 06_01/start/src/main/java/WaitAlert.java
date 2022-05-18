import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAlert {

    public static void waitAlert(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
    }
}
