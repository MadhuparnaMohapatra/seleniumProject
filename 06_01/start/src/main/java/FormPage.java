import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FormPage {

    public static void submitForm(WebDriver driver)
    {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Madhuparna");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Mohapatra");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Test Analyst");

        WebElement radioButton = driver.findElement(By.id("radio-button-2"));
        radioButton.click();

        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox-2"));
        checkbox.click();

        WebElement dropDown = driver.findElement(By.cssSelector("#select-menu"));
        dropDown.click();
        dropDown.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);

        WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("03/02/1997",Keys.ENTER);

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();
    }
}
