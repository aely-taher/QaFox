import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
    @Test
    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();

        Actions action = new Actions(driver); //mouse hover
        WebElement mouse = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        action.moveToElement(mouse).build().perform();
        driver.findElement(By.xpath("//a[@href='/users/2']")).click();

    }
}
