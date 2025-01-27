import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragDrop {
    @Test
    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='column-a']")));

        WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
        action.dragAndDrop(source, target).build().perform();

    }
    }

