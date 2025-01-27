import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDrop {

    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.tagName("select"));
        Select drop = new Select(dropdown);
//        drop.selectByVisibleText("Option 2");  //Method 1
//        int size = drop.getOptions().size();  //Method 2
//        System.out.println(size);

//        drop.selectByIndex(2); //Method 3
//        drop.selectByValue("1"); //Method 4
//        List<WebElement> options = drop.getAllSelectedOptions(); //Method 5
//        System.out.println(options.get(1).getText());

        WebElement firstClass = drop.getFirstSelectedOption(); //Method 6
        System.out.println(firstClass.getText());
    }
}
