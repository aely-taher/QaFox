import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvXpath {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //Abs xpath =  slow processing =  path started from dom
        String pageTitle = driver.findElement(By.xpath("/html/body/h1")).getText();
        System.out.println("Page Title: " + pageTitle);
        //Relative  Xpath = //tagname[@attr='attrvalue']
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        //Chain Xpath or complex xpath
        String centreElement = driver.findElement(By.xpath("//div[@class='block large-row-spacer']//legend[text()='Suggession Class Example']")).getText();
        System.out.println("Centre Element: " + centreElement);
        //Xpath with contains = //tagname[contains(@att, 'attvalue')]
        driver.findElement(By.xpath("//input[contains(@class,'ui-autocomplete-input')]")).sendKeys("Canada");
        //xpath with index while multiple element locator is indicating = (//tagname[@attr='attrvalue'])[index]
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        //xpath with text = //tagname[text()='text']
        //normalize space with text via xpath = //tagname[normalize-space()='text']
        String normalSpace = driver.findElement(By.xpath("//label[normalize-space()='Option1']")).getText();
        System.out.println(normalSpace);
        //and  with xpath = //tag[@att1='attval1' and @att2='attval2]
        //or with xpath = //tag[@att1='attval1' and @att2='attval2]
        //contains or starts-with
        driver.findElement(By.xpath("//legend[starts-with(text(), 'Radio Button')]")).getText();
        driver.findElement(By.xpath("//legend[contains(text(), 'Radio Button')]")).getText();
        //xpath with following sibling = //tag[text()='text']/following-sibling::thefollowingtag
       // driver.findElement(By.xpath(" //legend[text()='Switch To Alert Example']/following-sibling::input/following-sibling::input[@value='Alert']")).click();
        //xpath with following sibling = //tag[text()='text']/following-sibling::thefollowingtag/following-sibling::thefollowingtag/preceding-sibling::theprevioustag
         driver.findElement(By.xpath(" //legend[text()='Switch To Alert Example']/following-sibling::input/following-sibling::input[@value='Alert']/preceding-sibling::input")).sendKeys("Automation");
         //xpath with parent
        driver.findElement(By.xpath("//input[@value='radio1']/parent::label/preceding-sibling::legend")).getText();
        //Xpath with ancestor = //tah[@attr='attval']/ancestor::upperleveltag/instantbelowtag/and so on
        driver.findElement(By.xpath("(//input[@value='radio1']/ancestor::div/div/fieldset/legend)[1]")).getText();






    }
}
