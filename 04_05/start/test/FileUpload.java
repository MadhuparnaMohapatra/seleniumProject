import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/C:/Users/Madhuparna/Documents/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        //WebElement choose = driver.findElement(By.cssSelector("button.btn.btn-secondary.btn-choose"));
        //choose.click();

        //WebElement choose = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-choose"));
        //choose.click();

        //WebElement choose = driver.findElement(By.cssSelector("div.container form:nth-child(4) div.form-group:nth-child(1) div.input-group.input-file span.input-group-btn:nth-child(1) > button.btn.btn-secondary.btn-choose"));
        //choose.click();

        WebElement choose = driver.findElement(By.id("file-upload-field"));
        choose.sendKeys("file-to-upload.png");

        Thread.sleep(2000);

        WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
        reset.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
