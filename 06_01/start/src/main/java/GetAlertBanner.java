import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetAlertBanner {
    public static String getAlertBannerText(WebDriver driver)
    {
        return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
    }
}
