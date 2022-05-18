import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        WaitAlert waitAlert = new WaitAlert();
        waitAlert.waitAlert(driver);

        GetAlertBanner getAlertBanner = new GetAlertBanner();
        String alertText = getAlertBanner.getAlertBannerText(driver);

        Assert.assertEquals("The form was successfully submitted!",alertText);

        driver.quit();
    }

}
