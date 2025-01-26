import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetText {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement countryValue = driver.findElement(By.xpath("//div[@class='uU7dJb']"));
        String country = countryValue.getText();
        System.out.println(country);

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("Streams Tech Limited");
        String searchBarValue = searchBar.getAttribute("value");
        System.out.println(searchBarValue);
    }
}
