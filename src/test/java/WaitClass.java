import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("Streams Tech Limited" + Keys.ENTER);

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> searchList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//span/a/h3"))));
        for (int i = 0; i < searchList.size(); i++) {
            System.out.println(searchList.get(i).getText());

        }

    }
}

