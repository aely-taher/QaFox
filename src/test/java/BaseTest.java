import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {


    public void test() {
        WebDriverManager.chromedriver().setup(); //driver set up
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php"); //get url
        driver.manage().window().maximize(); //maximize the window

        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Taslima Taher");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Aely");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("aelytaher23@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("+880187123456");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("aely1234");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("aely1234");
        driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String thankYouText = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
        Assert.assertEquals(thankYouText, "Your Account Has Been Created!");



    }

}
