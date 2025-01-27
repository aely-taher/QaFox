import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class WebTable {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement addele = driver.findElement(By.xpath("//button[text()='Add']"));
        js.executeScript("arguments[0].scrollIntoView(true);", addele);
        List<WebElement> firstnames = driver.findElements(By.xpath("//div[contains(@class,'rt-tr' )]/div[@class='rt-td'][1]"));
        for (int i = 0; i < firstnames.size(); i++) {
            String firstName = firstnames.get(i).getText();
            if (firstName.trim().equals("Alden")) {
                driver.findElement(By.xpath("//div[contains(@class,'rt-tr-group') and @role='rowgroup']["+(i+1)+"]/div/div[7]/div/span[1]")).click();
            }
        }
    }

}
