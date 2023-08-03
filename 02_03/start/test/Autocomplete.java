import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Nick Stuff/Work/Selenium stuff/chromedriver/chromedriver" +
                ".exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Test Street 13, City test, Testland");
        Thread.sleep(3000);

        WebElement dismissKey = driver.findElement(By.className("dismissButton"));
        dismissKey.click();

        assert !dismissKey.isDisplayed();
        driver.quit();
    }
}
